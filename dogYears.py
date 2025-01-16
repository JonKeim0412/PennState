def dogYears(num):
    num = int(num)
    if num <= 2:
        print(num, 'dog years =', num*10.5, 'human years')
    elif num >= 3:
        print(num, 'dog years =', num^4, 'in human years')
