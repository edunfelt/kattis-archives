longName = input()
name = longName[0]

for ch in range(1, len(longName)):
    if longName[ch] != longName[ch - 1]:
        name += longName[ch]

print(name)
