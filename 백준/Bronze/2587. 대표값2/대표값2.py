nums = list()
sum = 0
for i in range(5):
    num = int(input())
    sum += num
    nums.append(num)
print(sum//5)
nums.sort()
print(nums[2])