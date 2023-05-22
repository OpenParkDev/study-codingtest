import sys

p_result = [0, 1, 1, 1, 2, 2]
            
def p(n):
    tail = len(p_result)-1
    if n > tail:
        for i in range(tail+1, n+1):
            p_result.append(p_result[i-1] + p_result[i-5])
    return p_result[n]

def get_answer():
    inputs_size = int(sys.stdin.readline())
    inputs_list = list(map(int, sys.stdin.readlines()))
    outputs_list = [str(p(i)) for i in inputs_list]
    sys.stdout.write("\n".join(outputs_list))

get_answer()