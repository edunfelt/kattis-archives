h, m = input().split()
h, m = [int(h), int(m)]

if m >= 45:
	print(h, m - 45)
else:
	if h == 0:
		dif = 45 - m - 1
		print(23, 59 - dif)
	else:
		dif = 45 - m - 1
		print(h - 1, 59 - dif)
