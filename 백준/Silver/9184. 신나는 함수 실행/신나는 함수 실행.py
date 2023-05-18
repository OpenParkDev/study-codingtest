import sys

w = [[[0 for _ in range(21)] for _ in range(21)] for _ in range(21)]
for i in range(21):
    for j in range(21):
        for k in range(21):
            if i == 0 or j == 0 or k == 0:
                w[i][j][k] = 1
            elif i < j and j < k:
                w[i][j][k] = w[i][j][k-1] + w[i][j-1][k-1] - w[i][j-1][k]
            else:
                w[i][j][k] = w[i-1][j][k] + w[i-1][j-1][k] + w[i-1][j][k-1] - w[i-1][j-1][k-1]
    
def w_result(input):
    a, b, c = input
    if a <= 0 or b <= 0 or c <= 0:
        return 1
    elif a > 20 or b > 20 or c > 20:
        return w[20][20][20]
    else:
        return w[a][b][c]

def get_answer():
    inputs_list = sys.stdin.read().splitlines()[:-1]
    inputs_list = [tuple(map(int, input.split())) for input in inputs_list]
    outputs_list = ["w({}, {}, {}) = {}".format(*input, w_result(input)) for input in inputs_list]
    sys.stdout.write("\n".join(outputs_list))

get_answer()