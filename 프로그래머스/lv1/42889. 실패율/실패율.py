def solution(N, stages):
    fails = [0 for _ in range(N+2)]
    for state in stages:
        fails[state] += 1
        
    reachs = [0 for _ in range(N+2)]
    reachs[-1] = fails[-1]
    for idx in range(len(reachs)-2, -1, -1):
        reachs[idx] = reachs[idx+1] + fails[idx]
        
    rates = [(i, 0) if reachs[i] == 0 else (i, fails[i]/reachs[i]) for i in range(1, N+1)]
    rates.sort(key=lambda x: x[1], reverse=True)

    return [info[0] for info in rates]