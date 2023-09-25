def solution(participant, completion):
    p = sorted(participant)
    c = sorted(completion)
    
    answer = ''
    for i in range(len(c)):
        if p[i] != c[i]:
            answer = p[i]
            break
    if answer == '':
        answer = p[-1]
    return answer