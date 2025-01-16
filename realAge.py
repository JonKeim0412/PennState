from datetime import *
def realAge():
    currentdate = datetime.now().date()
    day = int(input('Enter the day: '))
    month = int(input('Enter the month: '))
    year = int(input('Enter the year: '))
    birthdate = date(year,month,day)
    date2013 = date(2013,1,1)
    date2014 = date(2014,1,1)
    date2023 = date(2023,1,1)
    date2035 = date(2035,1,1)
    date2050 = date(2050,1,1)
    numdays = (currentdate - birthdate).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    numdays = (currentdate - date2013).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    numdays = (currentdate - date2014).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    numdays = (currentdate - date2023).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    numdays = (currentdate - date2035).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    numdays = (currentdate - date2050).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
print('You are ', numyears,' years old.\nYou are about ',numMonths,' moths old.\nand roughly ',numdays,' days old.')
print(realAge(date(2013,1,1), 'years')
