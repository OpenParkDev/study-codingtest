f = [0, 1, 1]
def fibo(n):
    for i in range(3, n+1):
        f.append(f[i-1] + f[i-2])
    return f[n]

n = int(input())
print(fibo(n), n-2)