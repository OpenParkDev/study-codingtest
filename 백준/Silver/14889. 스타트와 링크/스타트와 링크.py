import sys

matrix = []
minDiff = sys.maxsize

def getDiff(list, end):
    team1 = 0
    for i in range(0, len(list)):
        for j in range(i+1, len(list)):
            team1 += matrix[list[i]][list[j]] + matrix[list[j]][list[i]]
    list2 = [i for i in range(end) if i not in list]
    team2 = 0
    for i in range(0, len(list2)):
        for j in range(i+1, len(list2)):
            team2 += matrix[list2[i]][list2[j]] + matrix[list2[j]][list2[i]]
    return abs(team1 - team2)

def setTeam(list, start, end, remain):
    if remain == 0:
        curDiff = getDiff(list, end)
        global minDiff
        if minDiff > curDiff:
            minDiff = curDiff
        return
    for i in range(start, end):
        list.append(i)
        setTeam(list, i+1, end, remain-1)
        list.pop()

teamSize = int(input())
for i in range(teamSize):
    matrix.append(list(map(int, input().split())))
setTeam(list(), 0, teamSize, teamSize/2)
print(minDiff)