names = input()
short = names[0]
for c in range(0, len(names)):
    if names[c] == '-':
        short = short + names[c + 1]
    else:
        short = short
print(short)
