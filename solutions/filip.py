a, b = input().split()
c = a[2] + a[1] + a[0]
d = b[2] + b[1] + b[0]
c, d = [int(c), int(d)]
print(max(c, d))
