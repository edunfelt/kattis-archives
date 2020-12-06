x = int(input())
n = int(input())
c = n
p = 0
while c > 0:
    p = p + int(input())
    c -= 1
print(x * (n + 1) - p)
