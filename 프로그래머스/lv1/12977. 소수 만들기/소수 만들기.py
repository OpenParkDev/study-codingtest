import math

from itertools import combinations

def solution(nums):
    groups = list(combinations(nums, 3))
    numbers = list(sum(i) for i in groups)

    count = 0
    for number in numbers:
        if is_prime(number):
            count += 1
    return count

def is_prime(number):
    end = math.ceil(number / 2)
    for i in range(2, end):
        if number % i == 0:
            return False
    return True