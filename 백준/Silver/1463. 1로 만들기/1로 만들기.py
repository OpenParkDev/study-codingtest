def a(n):
    d = {1:0, 2:1, 3:1}
    if n not in d:
        val = min(a(n//3)+n%3, a(n//2)+n%2) + 1
        d[n] = val
    return d[n]

print(a(int(input())))