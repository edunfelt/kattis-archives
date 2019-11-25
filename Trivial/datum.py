import datetime

d, m = map(int, input().split())
time = datetime.date(2009, m, d)

print(time.strftime('%A'))