x1, x2 = input().split()
y1, y2 = input().split()
z1, z2 = input().split()
x1, x2, y1, y2, z1, z2 = [int(x1), int(x2), int(y1), int(y2), int(z1), int(z2)]

if x1 == y1:
    u1 = z1
elif x1 == z1:
    u1 = y1
else:
    u1 = x1

if x2 == y2:
    u2 = z2
elif x2 == z2:
    u2 = y2
else:
    u2 = x2

print(u1, u2)
