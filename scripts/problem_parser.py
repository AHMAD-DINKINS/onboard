import argparse
import json
import os
import textwrap

def parse(submissions):
    # read submissions
    with open(submissions) as f:
        submission_list = json.load(f)
    
    # A dictionary for hte different problems
    problems_dict = {}

    # create json that will represent dir structure
    #     problem
    # ||----- student
    # ||--------------- sub1.java
    # ||----------------doesnotCompileDir

    # fill problems
    for sub in submission_list:
        problem = sub['question']
        if not problem in problems_dict:
            problems_dict[problem] = {}

    # fill students
    for sub in submission_list:
        problem = sub['question']
        student = sub['user']
        if not student in problems_dict[problem]:
            problems_dict[problem][student] = {'submissible': [], 'error': []}

    # fill submissions
    for sub in submission_list:
        problem = sub['question']
        student = sub['user']
        result = sub['result']
        if result in problems_dict[problem][student]:
            problems_dict[problem][student][result].append(sub)
        else:
            problems_dict[problem][student][result] = [sub]

    # create the problem directory
    create_dir(problems_dict)
        

def create_dir(problems):

    for problem in problems:
        # might want to sort by time stamp
        for student in problems[problem]:
            for result in problems[problem][student]:
                write_files(problem, student, result, problems[problem][student][result])


def write_files(problem, student, result, submissions):
    submission_counter = 1
    submissions = sorted(submissions, key = lambda dic: int(dic['timestamp']))
    for sub in submissions:
        path = os.path.join('problems', problem, student, result, 'sub' + str(submission_counter) + '.java')
        basedir = os.path.dirname(path)

        if not os.path.exists(basedir):
            os.makedirs(basedir)

        content = sub['code']   
        time = sub['timestamp']
        with open(path, 'w') as f:
            f.write('//timestamp: ' + str(time) + '\n')
            f.write(content.encode('utf-8'))

        submission_counter += 1
    

if __name__ == "__main__":
    parser = argparse.ArgumentParser(prog="Problem Parser")
    parser.add_argument('submissions', metavar='Submissions', type=str, help='The json file containing student submissions')
    
    args = parser.parse_args()

    submissions = args.submissions

    parse(submissions)