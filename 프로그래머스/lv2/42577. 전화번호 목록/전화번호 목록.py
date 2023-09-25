def solution(phone_book):
    lengths = set()
    numbers = set()
    for number in phone_book:
        lengths.add(len(number))
        numbers.add(number)

    for number in phone_book:
        max_length = len(number)
        for length in lengths:
            if length > max_length:
                continue
            prefix = number[:length]
            if prefix in numbers and length != max_length:
                return False
    return True