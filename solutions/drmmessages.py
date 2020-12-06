message = input()
alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
h1 = message[:int(len(message)/2)]
h2 = message[int(len(message)/2):]
decrypted = ''
r1, r2 = 0, 0

for i in range(len(h1)):
    r1 += alphabet.index(h1[i])
    r2 += alphabet.index(h2[i])


for i in range(len(h1)):
    decrypted += alphabet[((alphabet.index(h1[i]) + r1) % 26 + (alphabet.index(h2[i]) + r2) % 26) % 26]

print(decrypted)