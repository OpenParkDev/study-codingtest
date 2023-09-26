def solution(arr):
    answer = []
    for num in arr:
        if len(answer) != 0 and num == answer[-1]:
            continue
        answer.append(num)
    return answer