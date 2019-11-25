from math import sin, cos, radians
n = int(input())
g = 9.81

for i in range(n):
    v0, theta, x1, h1, h2 = map(float, input().split())
    t = x1 / (v0 * cos(radians(theta)))
    y_pos = (v0 * t * sin(radians(theta))) - (g * t**2) / 2

    if y_pos - h1 >= 1 and h2 - y_pos >= 1:
        print('Safe')
    else:
        print('Not Safe') 
        