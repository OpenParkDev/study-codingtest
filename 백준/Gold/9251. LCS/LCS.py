row = input()
col = input()
matrix = [[0 for _ in range(len(col)+1)] for _ in range(len(row)+1)]
for i in range(1, len(row)+1):
    for j in range(1, len(col)+1):
        if row[i-1] == col[j-1]:
            matrix[i][j] = matrix[i-1][j-1] + 1
        else:
            matrix[i][j] = max(matrix[i-1][j], matrix[i][j-1])

print(matrix[-1][-1])