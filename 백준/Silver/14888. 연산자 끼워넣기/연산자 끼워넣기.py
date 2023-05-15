import sys

max = -1e9
min = 1e9

def read_input():
    nums_size = int(sys.stdin.readline())
    nums_list= list(map(int, sys.stdin.readline().split()))
    ops_list = list(map(int, sys.stdin.readline().split()))
    return [nums_size, nums_list, ops_list]

def update_result(val):
    global max, min
    if val < min:
        min = val
    if val > max:
        max = val

def custom_div(a, b):
    if a > 0:
        return a // b
    return -(-a//b)

def dfs(val, idx, nums_list, add, sub, mul, div):
    if (idx == 0):
        return update_result(val=val)
    
    if add > 0:
        dfs(val=val+nums_list[-idx], idx=idx-1, nums_list=nums_list
            , add=add-1, sub=sub, mul=mul, div=div)
    if sub > 0:
        dfs(val=val-nums_list[-idx], idx=idx-1, nums_list=nums_list
            , add=add, sub=sub-1, mul=mul, div=div)
    if mul > 0:
        dfs(val=val*nums_list[-idx], idx=idx-1, nums_list=nums_list
            , add=add, sub=sub, mul=mul-1, div=div)
    if div > 0:
        dfs(val=custom_div(val, nums_list[-idx]), idx=idx-1, nums_list=nums_list
            , add=add, sub=sub, mul=mul, div=div-1)

def get_answer():
    nums_size, nums_list, ops_list = read_input()
    dfs(val=nums_list[0], idx=nums_size-1, nums_list=nums_list
        , add=ops_list[0], sub=ops_list[1], mul=ops_list[2], div=ops_list[3])
    print(max)
    print(min)

get_answer()