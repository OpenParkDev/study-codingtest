import sys

size = int(sys.stdin.readline())
conn = dict([tuple(map(int, line.split())) for line in sys.stdin.readlines()])
starts = sorted(list(conn.keys()))

max_list = [0]
for start in starts:
    end = conn[start]
    if end > max_list[-1]:
        max_list.append(end)
    else:
        for idx in range(1, len(max_list)):
            if end < max_list[idx]:
                max_list[idx] = end
                break
print(size - (len(max_list) - 1))