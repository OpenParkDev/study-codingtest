def solution(s):
    answer = []
    numbers = {'zero':'0', 'one':'1', 'two':'2', 'three':'3', 'four':'4', 'five':'5', 'six':'6', 'seven':'7', 'eight':'8', 'nine':'9'}
    char = []
    for c in s:
        if c.isalpha():
            char.append(c)
        else:
            answer.append(c)
            
        if len(char) >= 3:
            num = ''.join(char)
            if num in numbers.keys():
                answer.append(numbers[num])
                char = []
    return int(''.join(answer))