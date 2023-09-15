def solution(babbling):
    count = 0
    for b in babbling:
        if is_possible(b):
            count += 1
    return count

def is_possible(word):
    prev = ''
    chars = []
    for c in word:
        chars.append(c)
        if len(chars) == 2 or len(chars) == 3:
            string = ''.join(chars)
            if string == prev:
                return False
            elif string in ['ye', 'ma', 'aya', 'woo']:
                prev = string
                chars = []
        elif len(chars) > 3:
            return False
    if chars:
        return False
        
    return True