import math

def solution(dartResult):
    score = -1
    scores = []
    options = []
    for res in dartResult:
        if res.isdigit():
            if score != -1:
                score = 10
            else:
                score = int(res)
                options.append('')
        elif res in ['*', '#']:
            options[-1] = res
        else:
            if res == 'S':
                scores.append(score)
            elif res == 'D':
                scores.append(int(math.pow(score, 2)))
            elif res == 'T':
                scores.append(int(math.pow(score, 3)))
            score = -1    
            
    for idx in range(len(options)):
        opt = options[idx]
        if opt == '':
            continue
        elif opt == '#':
            scores[idx] *= -1
        else:
            scores[idx] *= 2
            if idx != 0:
                scores[idx-1] *= 2

    return sum(scores)