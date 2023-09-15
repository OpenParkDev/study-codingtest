def solution(X, Y):
    share = []
    for digit in range(9, -1, -1):
        str_digit = str(digit)
        count = min(get_count(str_digit, X), get_count(str_digit, Y))
        for i in range(count):
            share.append(str_digit)
    
    if not share:
        return '-1'
    elif is_zero(share):
        return '0'
    return ''.join(share)

def get_count(digit, number):
    return sum(list(map(lambda x: 1 if x == digit else 0, number)))

def is_zero(str_number):
    return not sum(map(int, str_number))