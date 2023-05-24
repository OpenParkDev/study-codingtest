def get_min_cal(num):
    c = [0, 0, 1, 1]
    for i in range(4, num+1):
        if i % 3 == 0 and i % 2 == 0:
            c.append(min(c[i//3]+1, c[i//2]+1))
        elif i % 3 == 0:
            c.append(min(c[i//3]+1, c[i-1]+1))
        elif i % 2 == 0:
            c.append(min(c[i//2]+1, c[i-1]+1))
        else:
            c.append(c[i-1]+1)
    return c[num]

def get_answer():
    num = int(input())
    print(get_min_cal(num))

get_answer()