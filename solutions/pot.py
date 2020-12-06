n = int(input())
bases = []
exponents = []
x = 0


while n > 0:
    bases.append(input())
    n -= 1

exponents = [i[-1] for i in bases]
bases = [i[:-1] for i in bases]

exponents = list(map(int, exponents))
bases = list(map(int, bases))

for i in range(len(bases)):
    x += bases[i] ** exponents[i]

print(x)