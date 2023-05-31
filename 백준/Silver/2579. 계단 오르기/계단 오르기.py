import sys

def get_max_score(steps):
    max_score = []
    for i in range(len(steps)):
        if i == 0:
            max_score.append(steps[i])
        elif i == 1:
            max_score.append(steps[i] + steps[i-1])
        elif i == 2:
            max_score.append(steps[i] + max(steps[i-1], steps[i-2]))
        else:
            max_score.append(steps[i] + max(steps[i-1] + max_score[i-3], max_score[i-2]))
    return max_score[-1]

def get_answer():
    steps = list(map(int, sys.stdin.readlines()[1:]))
    print(get_max_score(steps))

get_answer()