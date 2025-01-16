import turtle
shape = input('Do you want to draw a circle or rectangle?')
while True:
        if shape == 'rectangle':
            length = int(input('What is the length?')) 
            width = int(input('What is the width?'))
            turtle.forward(length)
            turtle.right(90)
            turtle.forward(width)
            turtle.right(90)
            turtle.forward(length)
            turtle.right(90)
            turtle.forward(width)
        elif shape == 'circle':
            radius = int(input('What is the radius of your circle?'))
            turtle.circle(radius)
            
        finish = input('Would you like to do it again? ')
        if finish == 'yes':
            continue
        elif finish == 'no':
            print('Done!')
            quit(1)
