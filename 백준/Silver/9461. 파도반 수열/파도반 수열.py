import sys

p_result = [0, 1, 1, 1, 2, 2]
            
def p(n):
    for _ in range(n-len(p_result)+1):
            p_result.append(p_result[-1] + p_result[-5])     
    return p_result[n]

def get_answer():
    inputs_list = sys.stdin.readlines()[1:]
    outputs_list = [str(p(int(i))) for i in inputs_list]
    sys.stdout.write("\n".join(outputs_list))

get_answer()