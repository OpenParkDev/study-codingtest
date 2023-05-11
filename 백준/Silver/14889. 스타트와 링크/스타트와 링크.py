from itertools import combinations

def read_input():
    team_size = int(input())
    stat_matrix = [list(map(int, input().split())) for i in range(team_size)]
    return [team_size, stat_matrix]

def get_min_diff():
    team_size, stat_matrix = read_input()
    
    row_sum = [sum(i) for i in stat_matrix]
    col_sum = [sum(j) for j in zip(*stat_matrix)]
    stats = [i+j for i, j in zip(row_sum, col_sum)]
    
    total_stat = sum(row_sum)
    cases = list(combinations(stats, team_size // 2))
    
    min_diff = total_stat
    for case in cases:
        curr_diff = abs(total_stat - sum(case))
        if min_diff > curr_diff:
            min_diff = curr_diff
    
    print(min_diff)

get_min_diff()