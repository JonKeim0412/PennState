from datetime import *
from dateutil.relativedelta import relativedelta
def realAge():
    currentdate = datetime.now().date()
    twentyThrTeen = datetime.now().date() - relativedelta(years=8)
    twentyFrteen = datetime.now().date() - relativedelta(years=7)
    twentyTwntyThr = datetime.now().date() + relativedelta(years=1)
    twentyThrtyfv = datetime.now().date() + relativedelta(years=13)
    twentyFify = datetime.now().date() + relativedelta(years=28)
    day = int(input('Enter the day: '))
    month = int(input('Enter the month: '))
    year = int(input('Enter the year: '))
    birthdate = date(year,month,day)
    numdays = (currentdate - birthdate).days
    numyears = numdays//365
    numMonths = numyears*12 + (numdays%365)//30
    print('You are ',numyears,' years old today.\nYou are about ',numMonths,' months old today.\nand roughly ',numdays,' days old today.')
    numdays2 = (twentyThrTeen - birthdate).days
    numyears2 = numdays2//365
    numMonths2 = numyears2*12 + (numdays2%365)//30
    print('You are ',numyears2,' years old in 2013.\nYou are about ',numMonths2,' months old in 2013.\nand roughly ',numdays2,' days old in 2013.')
    numdays3 = (twentyFrteen - birthdate).days
    numyears3 = numdays3//365
    numMonths3 = numyears3*12 - (numdays3%365)//30
    print('You are ',numyears3,' years old in 2014.\nYou are about ',numMonths3,' months old in 2014.\nand roughly ',numdays3,' days old in 2014.')
    numdays4 = (twentyTwntyThr - birthdate).days
    numyears4 = numdays4//365
    numMonths4 = numyears4*12 - (numdays4%365)//30
    print('You are ',numyears4,' years old in 2023.\nYou are about ',numMonths4,' months old in 2023.\nand roughly ',numdays4,' days old in 2023.')
    numdays5 = (twentyThrtyfv - birthdate).days
    numyears5 = numdays5//365
    numMonths5 = numyears5*12 + (numdays5%365)//30
    print('You are ',numyears5,' years old in 2035.\nYou are about ',numMonths5,' months old in 2035.\nand roughly ',numdays5,' days old in 2035.')
    numdays6 = (twentyFify - birthdate).days
    numyears6 = numdays6//365
    numMonths6 = numyears6*12 + (numdays6%365)//30
    print('You are ',numyears6,' years old in 2050.\nYou are about ',numMonths6,' months old in 2050.\nand roughly ',numdays6,' days old in 2050.') 
##Write a program that will ask a user the year they were
##born, and the program will provide the user their age in
##years, ~months, and ~days in the year 2013.
##Also provide the same value for the years 2014, 2023, 2035, and 2050!
