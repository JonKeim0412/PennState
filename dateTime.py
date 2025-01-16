import datetime

currentYear = int(input('What year do you want? '))
currentMonth = int(input('What month do you want? '))
currentDay = int(input('What day do you want? '))
Num1 = int(input('Input a number: '))

currentDate = datetime.datetime(currentYear, currentMonth, currentDay)

endDate = currentDate + datetime.timedelta(days=Num1)

print('Your new date is', endDate)
