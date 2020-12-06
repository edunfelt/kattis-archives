l = int(input())
d = int(input())
x = int(input())

def dig_sum(number):
	return sum([int(n) for n in str(number)])

ints = list(range(l, d + 1))
sums = [num for num in ints if dig_sum(num) == x]

print(min(sums))
print(max(sums))
