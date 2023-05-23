import sys
            
def get_max_sum(nums_list):
    max_sum = -1000
    sums_list = [0]
    for num in nums_list:
        sums_list.append(max(sums_list[-1]+num, num))
        if sums_list[-1] > max_sum:
            max_sum = sums_list[-1]
    return max_sum

def get_answer():
    inputs_list = list(map(int, sys.stdin.readlines()[1].split()))
    print(get_max_sum(inputs_list))

get_answer()