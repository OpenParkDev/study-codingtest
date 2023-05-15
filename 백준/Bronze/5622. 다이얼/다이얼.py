import sys
str = sys.stdin.readline()
sum = 0
for c in str:
    if c in "ABC":
        sum += 3
    elif c in "DEF":
        sum += 4
    elif c in "GHI":
        sum += 5
    elif c in "JKL":
        sum += 6
    elif c in "MNO":
        sum += 7
    elif c in "PQRS":
        sum += 8
    elif c in "TUV":
        sum += 9
    elif c in "WXYZ":
        sum += 10
print(sum)