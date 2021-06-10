import argparse
import json
import os
import textwrap

if __name__ == "__main__":
  parser = argparse.ArgumentParser(prog="Problem Parser")
  parser.add_argument('submissions', metavar='Submissions', type=str, help='The json file containing student submissions')
    
  args = parser.parse_args()

  submissions = args.submissions

  parse(submissions)