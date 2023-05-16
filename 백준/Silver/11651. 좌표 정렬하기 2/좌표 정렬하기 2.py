import sys

def get_pos(nums):
    i, j = nums.split()
    return int(j) + int(i)/1000000

def get_answer():
    nums_list = sys.stdin.readlines()[1:]
    nums_list.sort(key=lambda nums: get_pos(nums))
    sys.stdout.write("".join(nums_list))

get_answer()