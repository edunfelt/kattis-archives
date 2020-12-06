n = int(input())
ints = []

while n > 0:
	ints.append(int(input()))
	n -= 1
	
for int in ints:
	if int%2 == 0:
		print(int, 'is even')
	else:
		print(int, 'is odd')
