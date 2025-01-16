num1 = int(input('What is your first number?'))
num2 = int(input('What is your second number?'))
           
if num1 == num2:
    print('they are equal')
elif num1 > num2:
    print(num1, 'is larger than', num2)
elif num2 > num1:
    print(num2, 'is larger than', num1)
