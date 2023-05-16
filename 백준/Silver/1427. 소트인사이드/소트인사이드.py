import sys

def get_answer():
    number = [*sys.stdin.readline().strip("\n")]
    number.sort(reverse=True)
    print(*number, sep="")

get_answer()