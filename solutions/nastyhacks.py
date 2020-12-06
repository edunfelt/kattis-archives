n = int(input())
advice = ['advertise', 'do not advertise', 'does not matter']
results = []

for i in range(n):
    r, e, c = input().split()
    r, e, c = int(r), int(e), int(c)

    if r > e - c:
        results.append(advice[1])
    elif r < e - c:
        results.append(advice[0])
    else:
        results.append(advice[2])

for ans in results:
    print(ans)