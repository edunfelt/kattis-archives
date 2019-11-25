message = input()
days = len(message)

for i in range(len(message)):
    if i % 3 == 0 and message[i] == 'P':
        days -= 1
    elif i % 3 == 1 and message[i] == 'E':
        days -= 1
    elif i % 3 == 2 and message[i] == 'R':
        days -= 1
    
print(days)
