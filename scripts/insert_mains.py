import argparse
import json
import os
import textwrap
from types import new_class
import xml.etree.ElementTree as ET
import random
import re


def get_passing_failing_tests(report):
    # ignoring asseriton errors in regresssion tests
    tree = ET.parse(report)
    root = tree.getroot()
    tests = []

    tests_tree = root.findall('testcase')
    for child in tests_tree:
        failure = child.find('failure')
        error = child.find('error')
        class_name = child.get('classname')
        if child.find('skipped') is not None:
            continue
        elif failure is not None:
            # if not 'AssumptionViolated' in failure.get('type'):
            tests.append((child.get('name'), class_name))
        elif error is not None:
            # if not 'AssumptionViolated' in error.get('type')[:-1]:
            tests.append((child.get('name'), child.get('classname')))
        # Double check test is 'passing' one
        else:
            tests.append((child.get('name'), child.get('classname')))

    return tests

    
def create_main(tests, path_to_tests):

    test_classes = get_tests(tests)

    for test_class in test_classes:
        end = test_class[-1]
        #TODO fix this
        if end.isdigit():
            test_class = test_class[:len(test_class) - 1]
        if not test_class in path_to_tests:
            continue
        pattern = ' ?(.*' + test_class + '.*) ?'
        pattern = pattern.replace("\\S", "\S")
        match = re.match(pattern, path_to_tests).group(0)
        if end.isdigit():
            match = match.replace(test_class, test_class + end)
            test_class = test_class + end
        path_to_testfile = os.path.abspath(match)

        with open(path_to_testfile) as f:
            lines = f.readlines()

        for line_idx in range(len(lines)):
            if "class" in lines[line_idx] and test_class in lines[line_idx]:
                lines[line_idx] += """

public static void main(String[] args) throws Throwable {
""" + "();\n".join(test_classes[test_class]) + """();
}
"""
                break     

        new_file = check_call_PUT(lines, tests, "TestStudentSubmission")

        new_file = new_file.replace("public void test", "public static void test")

        with open(path_to_testfile, 'w') as f:
            f.write(new_file)


def get_tests(tests):
    test_classes = {}
    for test in tests:
        if test[1] in test_classes:
            test_classes[test[1]].append(test[0])
        else:
            test_classes[test[1]] = [test[0]]

    return test_classes


def check_call_PUT(f_lines, tests, PUT_name):
    remove = []
    for test in tests:
        start = pos_of_test(test[0], f_lines)
        found = False
        for line_idx in range(start, len(f_lines)):
            if PUT_name in f_lines[line_idx]:
                found = True
            if found or "@Test" in f_lines[line_idx]:
                break
        if not found:
            remove.append(test[0] + "();")

    f_lines = "".join(f_lines)

    for elem in remove:
        f_lines = f_lines.replace(elem, "")
    
    return f_lines

def pos_of_test(test, lines):
    idx = -1
    for line_idx in range(len(lines)):
        if "void " + test in lines[line_idx]:
            idx = line_idx
            break
    return idx

    

if __name__ == "__main__":
    parser = argparse.ArgumentParser(prog="initTestRunner")
    parser.add_argument("--path-to-tests", help="path of test(s) to instrument", type=str, nargs='+', required=True)
    parser.add_argument("--report", help="xml report with information on test", type=str, required=True)
    # parser.add_argument("--return-passing", help="Return passing tests cases (default is false)", default=False, action='store_true')

    args = parser.parse_args()

    path_to_tests = args.path_to_tests[0]
    report = args.report
    # return_passing = args.return_passing

    tests = get_passing_failing_tests(report)

    create_main(tests, path_to_tests)

