import sys

wines = [0] + list(map(int, sys.stdin.readlines()[1:]))
max_score = [0]
for i in range(1, len(wines)):
    if i == 1:
        max_score.append(wines[i])
    elif i == 2:
        max_score.append(wines[i] + max_score[i-1])
    else:
        max_score.append(max(wines[i] + wines[i-1] + max_score[i-3], wines[i] + max_score[i-2], max_score[i-1]))
print(max_score[-1])