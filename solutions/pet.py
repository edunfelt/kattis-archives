players = []

for i in range(5):
    players.append([int(x) for x in input().split()])

points = [sum(player) for player in players]
score = max(points)
winner = points.index(max(points)) + 1

print(winner, score)
