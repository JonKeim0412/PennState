def ATM():
    counter = 1
    pin = int(input('Enter your 4-digit PIN: '))
    while pin != 1234:
        counter = counter + 1
        pin = int(input('Incorrect PIN, please try again: '))
        counter = int(counter)
        if counter == 3:
            print('Locked out')
            exit(1) 
    if pin == 1234:
        print('You entered the correct PIN')
