n = int(input())
dif = ''

for i in range(n):
    t1 = input()
    t2 = input()

    for i in range(len(t1)):
        if t1[i] == t2[i]:
            dif += '.'
        else:
            dif += '*'
    
    print(t1 + '\n' + t2 + '\n' + dif + '\n')
    dif = ''