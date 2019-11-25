n = int(input())

for i in range(n):
    b, p = input().split()
    b, p = int(b), float(p)

    max_time = p / (b - 1)
    min_time = p / (b + 1)
    min_abpm = 60 / max_time
    max_abpm = 60 / min_time
    bpm = (60 * b) / p

    print(min_abpm, bpm, max_abpm)