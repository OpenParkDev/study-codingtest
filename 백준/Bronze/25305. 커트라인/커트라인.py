import sys

def read_input():
    students_size, reward_size = map(int, sys.stdin.readline().split())
    scores_list = list(map(int, sys.stdin.readline().split()))
    return [students_size, reward_size, scores_list]

def get_answer():
    students_size, reward_size, scores_list = read_input()
    scores_list.sort(reverse=True)
    print(scores_list[reward_size-1])

get_answer()