def coupon():
    cost = int(input('What is the cost of your groceries? '))
    if cost < 10:
        print('you dont win a discount')
    elif cost >= 10 and cost < 60:
        print('you win a coupon of', 0.08 * cost)
    elif cost >= 60 and cost < 150:
        print('you win a coupon of', 0.10 * cost)
    elif cost >= 150 and cost < 210:
        print('you win a coupon of', 0.12 * cost)
    elif cost > 210:
        print('you win a coupon of', 0.14 * cost)
    
