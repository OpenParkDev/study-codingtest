import sys
from itertools import permutations

def read():
    nums_size = int(sys.stdin.readline())
    nums = list(map(int, sys.stdin.readline().split()))
    ops_size = list(map(int, sys.stdin.readline().split()))
    ops_dict = ["+", "-", "*", "//"]
    ops = []
    for idx in range(4):
        for i in range(ops_size[idx]):
            ops.append(ops_dict[idx])
    return [nums_size, nums, ops]

def cal_exp(nums, exp):
    result = nums[0]
    for idx in range(len(exp)):
        if exp[idx] == "+":
            result += nums[idx+1]
        elif exp[idx] == "-":
            result -= nums[idx+1]
        elif exp[idx] == "*":
            result *= nums[idx+1]
        else:
            if result < 0:
                result *= -1
                result //= nums[idx+1]
                result *= -1
            else:
                result //= nums[idx+1]
    return result

def get_maxmin():
    nums_size, nums, ops = read()
    exps = list(permutations(ops, nums_size-1))
    min = sys.maxsize
    max = -min
    for exp in exps:
        result = cal_exp(nums=nums, exp=exp)
        if result < min:
            min = result
        if result > max:
            max = result
    print(max)
    print(min)

get_maxmin()