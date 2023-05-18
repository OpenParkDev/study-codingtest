import sys

def w(input):
    a, b, c = input
    if a <= 0 or b <= 0 or c <= 0:
        return 1
    elif a > 20 or b > 20 or c > 20:
        a, b, c = 20, 20, 20

    w_result = [[[0 for _ in range(c+1)] for _ in range(b+1)] for _ in range(a+1)]
    for i in range(a+1):
        for j in range(b+1):
            for k in range(c+1):
                if i == 0 or j == 0 or k == 0:
                    w_result[i][j][k] = 1
                elif i < j and j < k:
                    w_result[i][j][k] = w_result[i][j][k-1] + w_result[i][j-1][k-1] - w_result[i][j-1][k]
                else:
                    w_result[i][j][k] = w_result[i-1][j][k] + w_result[i-1][j-1][k] + w_result[i-1][j][k-1] - w_result[i-1][j-1][k-1]

    return w_result[a][b][c]
    
def get_answer():
    inputs_list = sys.stdin.read().splitlines()[:-1]
    inputs_list = [tuple(map(int, input.split())) for input in inputs_list]
    outputs_list = ["w({}, {}, {}) = {}".format(*input, w(input)) for input in inputs_list]
    sys.stdout.write("\n".join(outputs_list))

get_answer()