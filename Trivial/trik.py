moves = input()
cups =['ball', 0, 0]

for move in moves:
	if move == 'A':
		order = [1, 0, 2]
		cups = [cups[i] for i in order]
	elif move == 'B':
		order = [0, 2, 1]
		cups = [cups[i] for i in order]
	else:
		order = [2, 1, 0]
		cups = [cups[i] for i in order]

print(cups.index('ball') + 1)
