import sys

def get_answer():
    vectors_size = int(sys.stdin.readline())
    vectors_list = list(map(int, sys.stdin.readline().split()))
    
    sorted_vectors_list = list(set(vectors_list))
    sorted_vectors_list.sort()
    index_dict = {val:idx for idx, val in enumerate(sorted_vectors_list)}
    
    sys.stdout.write(" ".join([str(index_dict[vector]) for vector in vectors_list]))

get_answer()