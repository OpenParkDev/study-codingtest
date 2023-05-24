d = {1:0, 2:1, 3:1}
def a(n):
    if n in d:
        return d[n]
    val = min(a(n//3)+n%3, a(n//2)+n%2) + 1
    d[n] = val
    return val
print(a(int(input())))