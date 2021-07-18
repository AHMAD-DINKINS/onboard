import argparse


def modify(test):
  with open(test) as f:
    lines = f.readlines()

  for l


if __name__ == "__main__":
  parser = argparse.ArgumentParser()

  parser.add_argument("-t", "--test", help="The test to instrument into the pair program", type=str)

  args = parser.parse_args()

  put = args.test

modify(test)
