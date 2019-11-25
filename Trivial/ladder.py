import math

h, v = input().split()
h, v = int(h), int(v)
l = math.ceil(h / math.sin(math.radians(v)))

print(l)