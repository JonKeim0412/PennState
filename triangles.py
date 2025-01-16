def triangle():
    try:
        first = float(input('Enter the first side: '))
        second = float(input('Enter the second side: '))
        third = float(input('Enter the third side: '))
        if first == second and second == third:
            print('Equilateral Triangle')
        elif first == second or second == third or first == third:
            print('Iosceles Triangle')
        else:
            print('Scalene Triangle')
    except:
        print('Sorry, the sides need to be an integer.')
    
