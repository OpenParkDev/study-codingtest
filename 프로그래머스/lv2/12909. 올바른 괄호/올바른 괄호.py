def solution(s):
    check = []
    for c in s:
        if c == '(':
            check.append(c)
        elif c == ')':
            if len(check) == 0:
                return False
            elif check[-1] == '(':
                check.pop()        
    
    return len(check) == 0