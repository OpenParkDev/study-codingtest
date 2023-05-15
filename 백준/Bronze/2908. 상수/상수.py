import sys
a, b = map(int, sys.stdin.readline()[::-1].split())
print(max(a,b))