input_size = int(input())
input_nums = list(map(int, input().split()))
stack = []
answer = [-1] * input_size
for idx in range(input_size):
    num = input_nums[idx]
    while len(stack) != 0:
        top = stack[-1]
        if top[0] < num:
            answer[top[1]] = num
            stack.pop()
        else:
            break
    stack.append((num, idx)) 
print(' '.join(map(str, answer)))