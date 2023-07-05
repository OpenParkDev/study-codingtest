import sys

cost_matrix= [list(map(int, x.split())) for x in sys.stdin.readlines()[1:]]
min_cost_matrix = [(0, 0, 0)]
total_min_cost = 0

for idx in range(len(cost_matrix)):
    curr_red, curr_green, curr_blue = cost_matrix[idx]
    prev_red, prev_green, prev_blue = min_cost_matrix[idx]
    
    min_red = curr_red + min(prev_green, prev_blue)
    min_green = curr_green + min(prev_red, prev_blue)
    min_blue = curr_blue+ min(prev_red, prev_green)
    
    min_cost_matrix.append((min_red, min_green, min_blue))
    total_min_cost = min(min_red, min_green, min_blue)
    
print(total_min_cost)