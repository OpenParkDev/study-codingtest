import sys

def read_input():
    nums_size = int(sys.stdin.readline())
    nums_list = [0 for i in range(10001)]
    for i in range(nums_size):
        num = int(sys.stdin.readline())
        nums_list[num] += 1
    return [nums_size, nums_list]

def get_answer():
    nums_size, nums_list = read_input()
    count = 0
    for i in range(10001):
        if (count == nums_size):
            break
        for j in range(nums_list[i]):
            print(i)
            count += 1

get_answer()