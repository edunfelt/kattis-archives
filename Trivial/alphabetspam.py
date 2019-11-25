message = input()
white_space = message.count('_')
lower = sum(1 for char in message if char.islower())
upper = sum(1 for char in message if char.isupper())
symbols = len(message) - white_space - lower - upper

print(white_space / len(message))
print(lower / len(message))
print(upper / len(message))
print(symbols / len(message))