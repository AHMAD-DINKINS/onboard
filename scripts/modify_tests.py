import argparse
import random
import re


def modify(test_file, put_name, o_type, put_args):
  with open(test_file) as f:
    lines = f.readlines()

  tests = get_tests(lines)
    
  for test in tests:
      start = pos_of_test(test, lines)
      found = False
      for line_idx in range(start, len(lines)):
          if put_name in lines[line_idx]:
              found = True
          if found or "@Test" in lines[line_idx]:
              break
      if not found:
        test_lines = lines[start:line_idx]
        inserted = insert_call(test_lines, o_type, put_args)
        lines[start:line_idx] = inserted
        
  lines = "".join(lines)
  
  with open(test_file, 'w') as f:
    f.write(lines)


def insert_call(lines, o_type, put_args):
  pattern = f"{o_type} ([a-zA-Z0-9]+) = PairProgram.generate[a-zA-z]+"

  for line_idx in range(0, len(lines)):
    match = re.search(pattern, lines[line_idx])
    if match:
      name = match.group(1)
      pair_program_num = line_idx * random.randint(0,20) # so pairprograms dont overlap
      add = ""
      if put_args:
        param = random.randint(-1000, 1000)
        add = f"""PairProgram pairProgram{pair_program_num} = new PairProgram();
  pairProgram{pair_program_num}.TestStudentSubmission({name}, ({param}));
"""
      else:
        add = f"""PairProgram pairProgram{pair_program_num} = new PairProgram();
  pairProgram{pair_program_num}.TestStudentSubmission({name});
"""
      lines[line_idx] += add
  
  return lines



    



def get_tests(lines):
  pattern = r'public void (test[0-9][0-9]*)\(\)' # pattern to capture name of tests within the test file

  lines_string = "".join(lines)

  tests = re.findall(pattern, lines_string)

  return tests


def pos_of_test(test, lines):
    idx = -1
    for line_idx in range(len(lines)):
        if "void " + test in lines[line_idx]:
            idx = line_idx
            break
    return idx


if __name__ == "__main__":
  parser = argparse.ArgumentParser()

  parser.add_argument("-t", "--test", help="The test to instrument into the pair program", type=str)
  parser.add_argument("-p", "--put_name", help="The name of the put to seach for within the tests", type=str)
  parser.add_argument("--type", help="The type of object being generated within the tests", type=str)
  parser.add_argument("-a", '--args', help="Addtional arguments for the put", type=str)

  args = parser.parse_args()

  test = args.test
  put_name = args.put_name
  o_type = args.type
  put_args = args.args

  modify(test, put_name, o_type, put_args)
