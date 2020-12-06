n = int(input())
days = list(range(366))
freefood = -1

for i in range(n):
    si, ti = map(int, input().split())
    for i in range(si, ti + 1):
        days[i] = 0

for i in range(len(days)):
    if days[i] == 0:
        freefood += 1
    
print(freefood)