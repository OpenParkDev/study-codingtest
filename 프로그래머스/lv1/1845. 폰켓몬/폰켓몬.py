def solution(nums):
    mons = len(set(nums))
    pick = int(len(nums) / 2)
    return min(mons, pick)