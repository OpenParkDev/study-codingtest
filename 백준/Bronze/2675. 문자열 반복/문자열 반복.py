def repeat(rSize, word):
    str = []
    for idx in range(len(word)):
        str.append(word[idx]*rSize)
    str = ''.join(str)
    return str

testSize = int(input())
for i in range(testSize):
    rSize, word = input().split()
    rSize = int(rSize)
    print(repeat(rSize, word))