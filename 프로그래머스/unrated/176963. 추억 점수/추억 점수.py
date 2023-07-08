def solution(name, yearning, photos):
    answer = []
    for photo in photos:
        score = 0
        for person in photo:
            if person in name:
                score += yearning[name.index(person)]
        answer.append(score)
    return answer