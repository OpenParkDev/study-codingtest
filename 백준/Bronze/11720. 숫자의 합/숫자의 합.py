import sys
n = sys.stdin.readline()
str = sys.stdin.readline().strip()
nums = list(map(int, [*str]))
print(sum(nums))