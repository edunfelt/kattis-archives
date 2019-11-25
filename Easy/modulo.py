integers = []
int_mod = []

for i in range(10):
    integers.append(int(input()))

for int in integers:
    int_mod.append(int % 42)

for int in int_mod:
    while int_mod.count(int) > 1:
        int_mod.remove(int)

print(len(int_mod))
