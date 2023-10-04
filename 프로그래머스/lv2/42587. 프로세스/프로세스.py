def solution(priorities, location):
    queue = list(enumerate(priorities))
    order = list(set(priorities))
    order.sort(reverse=True)
    length = len(priorities)
    
    run = []
    start = 0
    is_end = False
    for o in order:
        counter = 0
        idx = start
        while counter != length:
            task = queue[idx]
            curr = task[0]
            prior = task[1]
            if prior == o:
                run.append(task)
                start = idx
                if curr == location:
                    is_end = True
                    break
            idx += 1
            counter += 1
            if idx == length:
                idx = 0
        if is_end:
            break
    return len(run)