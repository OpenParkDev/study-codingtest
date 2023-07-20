import sys

size, limit = map(int, sys.stdin.readline().split())
row = size + 1
col = limit + 1
w = [0] * row
v = [0] * row
val = [[0] * col for _ in range(row)]

for item in range(1, row):
    w[item], v[item] = map(int, sys.stdin.readline().split())
    curr_w = w[item]
    curr_v = v[item]
    for curr_limit in range(1, col):
        if curr_w > curr_limit:
            val[item][curr_limit] = val[item-1][curr_limit]
        else:
            val[item][curr_limit] = max(val[item-1][curr_limit], val[item-1][curr_limit-curr_w] + curr_v)
print(val[-1][-1])