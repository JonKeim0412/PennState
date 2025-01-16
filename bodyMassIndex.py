weight = float(input('How much do you weigh in kilograms?'))
height = float(input('How tall are you in meters?'))
BMI = float(weight % height)
if BMI < 18.5:
    print('You are considered underweight')
elif BMI >= 18.5 and BMI <= 25:
    print('You are considered normal weight')
elif BMI > 25 and BMI <= 30:
    print('You are considered overweight')
elif BMI > 30:
    print('You are considered Obese')
##BMI
