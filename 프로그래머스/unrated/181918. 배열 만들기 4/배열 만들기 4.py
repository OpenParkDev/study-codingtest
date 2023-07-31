def solution(arr):
    stk = []
    n = len(arr)
    i = 0
    while i < n:
        num = arr[i]
        if len(stk) == 0 or stk[-1] < num:
            stk.append(num)
            i += 1
        else:
            stk.pop()
    return stk