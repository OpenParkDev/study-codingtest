def repeat(rSize, word):
    str = []
    for idx in range(len(word)):
        str.append(word[idx]*rSize)
    str = ''.join(str)
    return str

testSize = int(input())
result = list()
for i in range(testSize):
    rSize, word = input().split()
    rSize = int(rSize)
    result.append(repeat(rSize, word))
for str in result:
    print(str)