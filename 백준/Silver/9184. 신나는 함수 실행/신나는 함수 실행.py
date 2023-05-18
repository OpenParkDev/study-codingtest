import sys

w_result = [[[None for _ in range(21)] for _ in range(21)] for _ in range(21)]
            
def w(a, b, c):
    if a <= 0 or b <= 0 or c <= 0:
        return 1
    elif a > 20 or b > 20 or c > 20:
        return w(20, 20, 20)
    
    if w_result[a][b][c] == None:
        if a < b and b < c:
            w_result[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
        else:
            w_result[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
    
    return w_result[a][b][c]

def get_answer():
    inputs_list = sys.stdin.read().splitlines()[:-1]
    inputs_list = [tuple(map(int, input.split())) for input in inputs_list]
    outputs_list = ["w({}, {}, {}) = {}".format(*input, w(*input)) for input in inputs_list]
    sys.stdout.write("\n".join(outputs_list))

get_answer()