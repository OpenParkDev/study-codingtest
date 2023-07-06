import sys

word = input()
word_list = []
for i in range(len(word)-2):
    for j in range(i+1, len(word)-1):
        new_word = word[:i+1][::-1] + word[i+1:j+1][::-1] + word[j+1:][::-1]
        word_list.append(new_word)

word_list.sort()
print(word_list[0])