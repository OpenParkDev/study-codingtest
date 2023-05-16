import sys

def read_input():
    nums_size = int(sys.stdin.readline())
    nums_list = []
    for idx in range(nums_size):
        i, j = map(int, sys.stdin.readline().split())
        nums_list.append((i, j))
    return nums_list

def get_answer():
    nums_list = read_input()
    nums_list.sort()
    for nums in nums_list:
        print(nums[0], nums[1])

get_answer()