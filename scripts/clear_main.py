import argparse
import json
import os
import textwrap
import xml.etree.ElementTree as ET
import re


def clear(test):
  with open(test) as f:
    lines = f.readlines()

  start = -1
  end = -1
  for line_idx in range(len(lines)):
    if "main" in lines[line_idx]:
      start = line_idx
    if '}' in lines[line_idx]:
      end = line_idx + 1
      break
  new_lines = "".join(lines[0:start] + lines[end:]) if start > 0 else "".join(lines)
  new_lines = new_lines.replace("public static void", "public void")
  
  with open(test, 'w') as f:
    f.write(new_lines)

if __name__ == "__main__":
  parser = argparse.ArgumentParser()

  parser.add_argument("--test", help="path of test to clear main from", type=str, required=True)
  
  args = parser.parse_args()

  test = args.test

  clear(test)