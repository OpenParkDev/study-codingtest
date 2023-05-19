f = [1, 1]

def get_answer():
    n = int(input())
    for i in range(2, n+1):
        f.append((f[i-1] + f[i-2]) % 15746)
    print(f[n])

get_answer()