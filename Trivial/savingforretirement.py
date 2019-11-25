b, bR, bS, a, aS = input().split()
b, bR, bS, a, aS = [int(b), int(bR), int(bS), int(a), int(aS)]

bM = (bR - b) * bS
aM = 0
aR = a

while aM < bM:
	aR += 1
	aM += aS
	
print(aR)
