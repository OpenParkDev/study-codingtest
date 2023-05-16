import sys

def read_input():
    nums_size = int(sys.stdin.readline())
    nums_list = [False for i in range(2000001)]
    for i in range(nums_size):
        num = int(sys.stdin.readline())
        nums_list[num+1000000] = True
    return [nums_size, nums_list]

def get_answer():
    nums_size, nums_list = read_input()
    print("\n".join([str(i-1000000) for i in range(2000001) if nums_list[i] == True]))

get_answer()