import sys

def remove_duplicates(words_list):
    prev = words_list[0]
    new_words_list = [prev]
    for word in words_list:
        if (prev != word) :
            new_words_list.append(word)
            prev = word
    return new_words_list

def get_answer():
    words_list = sys.stdin.readlines()[1:]
    words_list.sort()
    words_list.sort(key=lambda word: len(word))
    words_list = remove_duplicates(words_list)
    sys.stdout.write("".join(words_list))

get_answer()