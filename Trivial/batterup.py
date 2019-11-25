n = int(input())
at_bats = list(map(int, input().split()))
walks = at_bats.count(-1)
total = 0

for i in at_bats:
    if i != -1:
        total += i

slugging_percentage = total / (len(at_bats) - walks)

print(slugging_percentage)