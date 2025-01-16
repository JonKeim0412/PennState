import random
while True:
    x = random.randint(1, 100)
    print('\n\tYou have 10 chances to guess the number!\n')
    count = 0
    while count < 10:
        count += 1
        guess = int(input('Guess a number: '))
        if x > guess:
            print('You guessed too small!')
        elif x < guess:
            print('You Guessed too high!')
        if count >= 10:
            print('\nThe number is %d' % x)
            print('\tBetter Luck Next time!')
        if x == guess:
            print('Congratulations you did it in ', count, 'tries')
        if guess == x or count >= 10:
            y = input('Do you want to play again? ')
            if y == 'no':
                print('Done!')
                quit(1)
            if y == 'yes':
                break
