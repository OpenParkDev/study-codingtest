import sys

def get_answer():
    words = sys.stdin.readlines()[1:]
    words_list = list(set(words))
    words_list.sort()
    words_list.sort(key=lambda word: len(word))
    sys.stdout.write("".join(words_list))

get_answer()