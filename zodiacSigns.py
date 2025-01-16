try:
    def realAge():
        day = int(input('Enter the day: '))
        month = int(input('Enter the month: '))
        year = int(input('Enter the year: '))
        if month == 3 != day >= 21:
            print('You are an Aries')
        if month == 4 != day <= 19:
            print('You are an Aries')
        if month == 4 != day >= 20:
            print('You are a Taurus')
        if month == 5 != day <= 20:
            print('You are a Taurus')
        if month == 5 != day >= 21:
            print('You are a Gemini')
        if month == 6 != day <= 20:
            print('You are a Gemini')
        if month == 6 != day >= 21:
            print('You are a Cancer')
        if month == 7 != day <= 22:
            print('You are a Cancer')
        if month == 7 != day >= 23:
            print('You are a Leo')
        if month == 8 != day <= 22:
            print('You are a Leo')
        if month == 8 != day >= 23:
            print('You are a Virgo')
        if month == 9 != day <= 22:
            print('You are a Virgo')
        if month == 9 != day >= 23:
            print('You are a Libra')
except TypeError:
    print('One of your inputs waas not correct, please try again')
