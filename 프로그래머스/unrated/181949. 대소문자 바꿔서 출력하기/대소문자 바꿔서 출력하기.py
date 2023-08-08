str = input()
answer = []
for c in str:
    if c.islower():
        c = c.upper()
    else:
        c = c.lower()
    answer.append(c)
print(''.join(answer))