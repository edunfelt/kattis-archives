n = int(input())
qaly = 0.0
while n > 0:
    q, y = input().split()
    q, y = [float(q,), float(y)]
    qaly = qaly + q * y
    n -= 1
print(qaly)
