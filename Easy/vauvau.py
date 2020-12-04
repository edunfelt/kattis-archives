def attacks(attack_time, rest_time, cur_time):
    """
    Return True if attack occurs, and False otherwise.
    
    :param attack_time: number of minutes dog attacks
    :param rest_time: number of minutes dog rests
    :param cur_time: time person arrives
    :return: True if person is attacked, False otherwise
    """
    n = 0
    upper = attack_time
    lower = 0
    attack = True
    while cur_time > upper:
        upper = (n + 1) * attack_time + n * rest_time
        lower = n * (attack_time + rest_time)
        n += 1
        
        if lower < cur_time <= upper:
            attack = True
        else:
            attack = False
    
    return attack


def attack_number(a_attack, a_rest, b_attack, b_rest, cur_time):
    """
    Determine the number of attacks a person suffers.

    :param a_attack: number of minutes first dog attacks
    :param a_rest: number of minutes first dog rests
    :param b_attack: number of minutes second dog attacks
    :param b_rest: number of minutes second dog rests
    :param cur_time: time person arrives
    :return: 'both' if two attacks, 'one' if one attack, 'none' if no attacks
    """
    a_status = attacks(a_attack, a_rest, cur_time)
    b_status = attacks(b_attack, b_rest, cur_time)

    if a_status and b_status:
        return 'both'
    elif not (a_status or b_status):
        return 'none'
    else:
        return 'one'


def main():
    a, b, c, d = [int(x) for x in input().split()]
    p, m, g = [int(x) for x in input().split()]
    print(attack_number(a, b, c, d, p))
    print(attack_number(a, b, c, d, m))
    print(attack_number(a, b, c, d, g))


if __name__ == '__main__':
    main()
