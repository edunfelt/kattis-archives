k, q, r, b, h, p = input().split()
k, q, r, b, h, p = [int(k), int(q), int(r), int(b), int(h), int(p)]
if k != 1:
    k = 1 - k
elif k == 1:
    k = 0
if q != 1:
    q = 1 - q
elif q == 1:
    q = 0
if r != 2:
    r = 2 - r
elif r == 2:
    r = 0
if b != 2:
    b = 2 - b
elif b == 2:
    b = 0
if h != 2:
    h = 2 - h
elif h == 2:
    h = 0
if p != 8:
    p = 8 - p
elif p == 8:
    p = 0
print(k, q, r, b, h, p)
