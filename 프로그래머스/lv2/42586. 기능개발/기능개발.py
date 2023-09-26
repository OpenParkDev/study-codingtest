import math

def solution(progresses, speeds):
    time = 1
    answer = []
    counter = 0
    for idx in range(len(progresses)):
        start = progresses[idx]
        speed = speeds[idx]
        curr = start + speed * time
        if curr < 100:
            time += math.ceil((100 - curr) / speed)
            if counter != 0:
                answer.append(counter)
            counter = 1
        else:
            counter += 1
    if counter != 0:
            answer.append(counter)
    
    return answer