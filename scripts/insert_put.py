import argparse


def insert_put(put, pair_program):
  with open(put) as f:
    put_lines = f.readlines()

  with open(pair_program) as f:
    program_lines = f.readlines()

  for line_idx in range(len(program_lines)):
    if "TestStudentSubmission" in program_lines[line_idx]:
      program_lines[line_idx] = program_lines[line_idx].replace("Test", "Test_")
      program_lines = program_lines[:line_idx] + put_lines + ["\n"] + program_lines[line_idx:]
      break

  with open(pair_program, 'w') as f:
    to_write = "".join(program_lines)
    f.write(to_write)


def remove_put(pair_program):
  with open(pair_program) as f:
    program_lines = f.readlines()

  # using list comp to find lines with StudentSubmission in them
  target_lines = [line_idx for line_idx in range(len(program_lines)) if "StudentSubmission" in program_lines[line_idx]]

  # Nothing to remove otherwise
  if (len(target_lines) > 1):
    pos_put_wrapper = target_lines[0]
    pos_put = target_lines[-1]
    program_lines = program_lines[:pos_put_wrapper + 1] + program_lines[pos_put + 1:]
    program = "".join(program_lines)
    with open(pair_program, 'w') as f:
      f.write(program)

  


if __name__ == "__main__":
  parser = argparse.ArgumentParser()

  parser.add_argument("-p", "--put", help="The put to instrument into the pair program", type=str)
  parser.add_argument("--pair-program", help="The pair program", type=str)
  parser.add_argument("-r", "--remove", help="Remove the wrapper put", default=False, action='store_true')

  args = parser.parse_args()

  put = args.put
  pair_program = args.pair_program
  remove = args.remove
  if remove:
    remove_put(pair_program)
  else:
    insert_put(put, pair_program)
