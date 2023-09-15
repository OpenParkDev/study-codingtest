def solution(n, m, section):
    count = 0
    start = 0
    for s in section:
        if start == 0:
            start = s
        elif s - start >= m:
            start = s
            count += 1
    count += 1
        
    return count