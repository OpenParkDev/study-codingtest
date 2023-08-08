import sys

input_size = int(sys.stdin.readline())
input_nums = list(map(int, sys.stdin.readline().split()))
stack = []
answer = [-1] * input_size
for idx in range(input_size):
    num = input_nums[idx]
    while len(stack) != 0:
        top = stack[-1]
        if input_nums[top] < num:
            answer[top] = num
            stack.pop()
        else:
            break
    stack.append(idx) 
print(' '.join(map(str, answer)))