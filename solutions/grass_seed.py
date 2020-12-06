c = float(input())
l = int(input())
cost = 0.0
while l > 0:
    w, h = input().split()
    w, h = [float(w), float(h)]
    cost = cost + (w * h * c)
    l -= 1
print(cost)
