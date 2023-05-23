import sys
            
def get_max_sum(nums_list):
    max_sum = -1000
    sums_list = []
    for i in range(len(nums_list)):
        num = int(nums_list[i])
        if i == 0:
            sums_list.append(num)
        else:
            sums_list.append(max(sums_list[i-1]+num, num))
        
        curr = sums_list[-1]
        if curr > max_sum:
            max_sum = curr
    return max_sum

def get_answer():
    inputs_list = sys.stdin.readlines()[1].split()
    print(get_max_sum(inputs_list))

get_answer()