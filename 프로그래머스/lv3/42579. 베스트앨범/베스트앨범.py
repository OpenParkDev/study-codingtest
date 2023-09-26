def solution(genres, plays):
    genre_time = dict()
    genre_song = dict()
    for idx in range(len(genres)):
        g = genres[idx]
        if g not in genre_song.keys():
            genre_song[g] = []
            genre_time[g] = 0
        genre_song[g].append((idx, plays[idx]))
        genre_time[g] += plays[idx]
    
    genre_order = []
    for key in genre_time.keys():
        genre_order.append((key, genre_time[key]))
    genre_order.sort(key=lambda x: x[1], reverse=True)
    
    answer = []
    for g in genre_order:
        songs = genre_song[g[0]]
        songs.sort(key=lambda x: x[1], reverse=True)
        answer.append(songs[0][0])
        if len(songs) >= 2:
            answer.append(songs[1][0])
    
    return answer