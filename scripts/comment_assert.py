import argparse
import os
import textwrap
import re

#TODO use putname from shell script
def comment(test, uncomment):
  with open(test) as f:
    lines = f.readlines()

  if uncomment:
    with open(test, 'w') as f:
      f.write("".join(lines).replace("//*", ""))
    return

  for line_idx in range(len(lines)):
    pos = -1
    if "TestStudentSubmission" in lines[line_idx]:
      pos = line_idx
    if (pos > 0):
      tempLines = "===".join(lines[pos:]).replace("assertTrue", "//*assertTrue")
      lines[pos:] = tempLines.split("===")
      break

  with open(test, 'w') as f:
    f.write("".join(lines))

if __name__ == "__main__":
  parser = argparse.ArgumentParser()

  parser.add_argument("--test", help="test to remove try catch from", type=str, required=True)
  parser.add_argument("--uncomment", help="Uncomment test (default is false)", default=False, action='store_true')

  args = parser.parse_args()

  test = args.test
  uncomment = args.uncomment

  comment(test, uncomment)
