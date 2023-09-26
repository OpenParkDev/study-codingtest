def solution(clothes):
    options = dict()
    for item, kind in clothes:
        if kind not in options.keys():
            options[kind] = []
        options[kind].append(item)
    
    answer = 1
    for kind in options.keys():
        answer *= len(options[kind]) + 1
    return answer - 1