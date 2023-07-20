def solution(d, budget):
    d.sort()
    total = 0
    count = 0
    for i in range(len(d)):
        if total + d[i] > budget:
            break
        total += d[i]
        count += 1
    return count