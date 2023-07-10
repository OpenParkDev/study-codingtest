n = int(input())
series = [[0] + [1 for _ in range(1, 10)]]

for i in range(1, n):
    prev = series[-1]
    curr = [0 for _ in range(10)]
    for idx in range(len(prev)):
        if idx == 0:
            curr[idx+1] += prev[idx]
        elif idx == 9:
            curr[idx-1] += prev[idx]
        else:
            curr[idx-1] += prev[idx]
            curr[idx+1] += prev[idx]
    series.append(curr)

print(sum(series[-1]) % 1000000000)