r, n = input().split()  # input total no. of rooms and no. of occupied rooms
r, n = [int(r), int(n)]
occupied = []  # list of occupied room numbers
total = list(range(1, r + 1))  # list of all room numbers

# add occupied rooms to the list
while n > 0:
    occupied.append(int(input()))
    n -= 1

# remove occupied rooms from the list of total rooms
for room in occupied:
    total.remove(room)

# if no rooms available print 'too late', otherwise print the first free room
if not total:
    print('too late')
else:
    print(total[0])
