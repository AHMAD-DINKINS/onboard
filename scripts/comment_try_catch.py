import argparse
import os
import textwrap
import re

# change to take in PUT_name
def comment(test, uncomment):
  with open(test) as f:
    lines = f.readlines()

  if uncomment:
    with open(test, 'w') as f:
      f.write("".join(lines).replace("//*", ""))
    return

  comment = False
  catch_seen = False
  for line_idx in range(len(lines)):
    # remove evosuite methods so daikon can run without stopping
    if "fail(" in lines[line_idx] or "verifyException(" in lines[line_idx]:
      lines[line_idx] = ""
      continue
    if "try" in lines[line_idx]:
      comment = True
    if "catch" in lines[line_idx]:
      catch_seen = True
      lines[line_idx] = "//*" + lines[line_idx]
      continue
    if not "StudentSubmission" in lines[line_idx] and comment:
        lines[line_idx] = "//*" + lines[line_idx]
    if catch_seen and "}" in lines[line_idx]:
      comment = False
      catch_seen = False

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

