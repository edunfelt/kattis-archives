def max_sequence(listeners, price):
    """ 
    Compute the maximum earnings for a sequence of length 'length'. 
    An instance of the maximum subarray problem. 
    
    :param listeners: list of listeners for each break slot
    :param price: price per break
    :return: maximum profit
    """
    best = 0
    cur_sum = 0
    for cur_listeners in listeners:
        cur_sum = max(0, cur_listeners + cur_sum - price)
        best = max(best, cur_sum)
    return best


def main():
    n, p = [int(x) for x in input().split()]
    students = [int(x) for x in input().split()]
    print(max_sequence(students, p))


if __name__ == '__main__':
    main()
