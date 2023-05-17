import sys

def get_answer():
    vectors_size = int(sys.stdin.readline())
    vectors_list = list(map(int, sys.stdin.readline().split()))
    
    sorted_vectors_list = list(set(vectors_list))
    sorted_vectors_list.sort()
    
    vectors_dict = {}
    for idx in range(len(sorted_vectors_list)):
        vectors_dict[sorted_vectors_list[idx]] = idx
    
    for vector in vectors_list:
        print(vectors_dict[vector], end=" ")

get_answer()