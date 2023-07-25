def solution(x):
    a = x // 10000
    b = x // 1000 - a*10
    c = x // 100 - (a*100 + b*10)
    d = x // 10 - (a*1000 + b*100 + c*10)
    e = x % 10
    return (x % (a + b + c + d + e) == 0)