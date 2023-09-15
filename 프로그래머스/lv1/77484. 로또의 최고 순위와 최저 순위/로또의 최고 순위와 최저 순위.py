def solution(lottos, win_nums):
    pick = sum(list(map(lambda x: 1 if x == 0 else 0, lottos)))
    rest = len(set(win_nums).difference(set(lottos)))
    correct = 6 - rest
    bonus = min(pick, rest)
    best = (lambda x : 7 - x if x != 0 else 6)(correct+bonus)
    worst = (lambda x : 7 - x if x != 0 else 6)(correct)
    answer = [best, worst]
    return answer