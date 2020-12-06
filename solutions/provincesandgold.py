g, s, c = input().split()
g, s, c = int(g), int(s), int(c)

victory_cards = ['Province', 'Duchy', 'Estate']
treasure_cards = ['Gold', 'Silver', 'Copper']

buying_power = 3 * g + 2 * s + c
victory = ''
treasure = treasure_cards[2]

if buying_power >= 8:
    victory = victory_cards[0]
    treasure = treasure_cards[0]
elif buying_power >= 5:
    victory = victory_cards[1]
    if buying_power >=6:
        treasure = treasure_cards[0]
    else:
        treasure = treasure_cards[1]
elif buying_power >= 2:
    victory = victory_cards[2]
    if buying_power >=3:
        treasure = treasure_cards[1]
    else:
        treasure = treasure_cards[2]
    
if buying_power < 2:
    print(treasure)
else:
    print(victory, 'or', treasure)