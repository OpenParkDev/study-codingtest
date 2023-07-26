def solution(arr1, arr2):
    answer = [[arr1[row][col]+arr2[row][col] for col in range(len(arr1[row]))] for row in range(len(arr1))]
    return answer