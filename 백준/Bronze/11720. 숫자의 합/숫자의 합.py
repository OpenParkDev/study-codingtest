import sys
n = sys.stdin.readline()
str = sys.stdin.readline().strip()
nums = list(map(int, [*str]))
sum = 0
for num in nums:
    sum += num
print(sum)