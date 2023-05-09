n = int(input())
numbers = list()
for i in range(n):
    numbers.append(int(input()))
numbers.sort()
for i in numbers:
    print(i)