import sys

pyramid = [list(map(int, x.split())) for x in sys.stdin.readlines()[1:]]
max_path = [(0, )]

for floor in pyramid:
    curr_path = []
    for idx in range(len(floor)):
        curr = floor[idx]
        prev = max_path[-1]
        prev_left = 0
        prev_right = 0
        if (idx - 1) >= 0:
            prev_left = prev[idx-1]
        if len(prev) > idx:
            prev_right = prev[idx]
        curr_path.append(curr + max(prev_left, prev_right))
    max_path.append(tuple(curr_path))

print(max(max_path[-1]))