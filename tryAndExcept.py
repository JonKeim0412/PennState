birthYear = input('What year were you born?')
try:
    int(birthYear)
except:
    print('Sorry, your Birth Year should be a number')
