from itertools import combinations

def read():
    team_size = int(input())
    stat_matrix = list()
    for i in range(team_size):
        stat_matrix.append(list(map(int, input().split())))
    return [team_size, stat_matrix]

def get_min_diff():
    team_size, stat_matrix = read()
    
    row_sum = [sum(i) for i in stat_matrix]
    col_sum = [sum(i) for i in zip(*stat_matrix)]
    stats = [row_sum[i] + col_sum[i] for i in range(team_size)]
    
    total_stat = sum(stats)
    cases = list(combinations(stats, team_size // 2))
    
    min_diff = total_stat
    for case in cases:
        curr_diff = abs(total_stat // 2 - sum(case))
        if min_diff > curr_diff:
            min_diff = curr_diff
    
    print(min_diff)

get_min_diff()