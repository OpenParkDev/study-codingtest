import sys
            
def get_max_sum(nums_list):
    max_sum = -1000
    sum = 0
    for num in nums_list:
        sum = max(sum+num, num)
        if sum > max_sum:
            max_sum = sum
    return max_sum

def get_answer():
    inputs_list = list(map(int, sys.stdin.readlines()[1].split()))
    print(get_max_sum(inputs_list))

get_answer()