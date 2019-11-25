t = int(input())
tests = []


def fact(n):
    if n == 1:
        return n
    else:
        return n * fact(n - 1)


while t > 0:
    n = int(input())
    tests.append(fact(n))
    t -= 1

for x in tests:
    print(x % 10)