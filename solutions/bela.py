n, b = input().split()
n = 4 * int(n)
cards = []
sum = 0

while n > 0:
	cards.append(input())
	n -= 1
	
for card in cards:
	if card[0] == 'A':
		sum += 11
	elif card[0] == 'K':
		sum += 4
	elif card[0] == 'Q':
		sum += 3
	elif card[0] == 'J':
		if card[1] == b:
			sum += 20
		else:
			sum += 2
	elif card[0] == 'T':
		sum += 10
	elif card[0] == '9':
		if card[1] == b:
			sum += 14
		else:
			sum += 0
	elif card[0] == '8':
		sum += 0
	elif card[0] == '7':
		sum += 0

print(sum)
