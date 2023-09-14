def solution(n, arr1, arr2):
    bin_map = [bin(arr1[i] | arr2[i])[2:]for i in range(n)]
    answer = []
    for row in bin_map:
        row = (n - len(row)) * '0' + row
        row = row.replace('1', '#')
        row = row.replace('0', ' ')
        answer.append(row)
    return answer