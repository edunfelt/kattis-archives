n, w, h = input().split()
n, w, h = [int(n), int(w), int(h)]
d = (w**2 + h**2)**(0.5)
results = []

while n > 0:
    l = int(input())
    results.append(l)
    n -= 1

for x in results:
    if x > max(w, h, d):
        print('NE')
    elif x <= max(w, h, d):
        print('DA')
