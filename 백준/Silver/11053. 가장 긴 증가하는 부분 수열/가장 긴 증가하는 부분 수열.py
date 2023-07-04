import sys

num_list = list(map(int, sys.stdin.readlines()[1].split()))
max_list = [0]
for num in num_list:
    if num > max_list[-1]:
        max_list.append(num)
    else:
        for idx in range(1, len(max_list)):
            if num <= max_list[idx]:
                max_list[idx] = num
                break
print(len(max_list)-1)