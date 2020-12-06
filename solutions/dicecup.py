d1, d2 = input().split()
d1, d2 = [int(d1), int(d2)]
mean = (d1 + d2 + 2) / 2

if d1 == d2:
	print(int(mean))
elif d1 > d2:
	for i in range(d2 + 1, d1 + 2):
		print(i)
else:
	for i in range(d1 + 1, d2 + 2):
		print(i)
