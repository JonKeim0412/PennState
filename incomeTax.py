def tax():
    income = int(input('What is your yearly income? '))
    if income == 50000:
        print('you will be taxed $', income * 0.01)
    if income > 50000 and income <= 75000:
        print('you will be taxed $', income * 0.02)
    if income > 75000 and income <= 100000:
        print('you will be taxed $', income * 0.03)
    if income > 100000 and income <= 250000:
        print('you will be taxed $', income * 0.04)
    if income > 250000 and income <= 500000:
        print('you will be taxed $', income * 0.05)
    if income > 500000:
        print('you will be taxed $', income * 0.06)
    
