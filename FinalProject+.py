import datetime
now = datetime.datetime.now()
today8am = now.replace(hour=8, minute=0, second=0, microsecond=0)
today745pm = now.replace(hour=19, minute=45, second=0, microsecond=0)
def Shop():
    cust = []
    barb = []
    custTime = []
    barbTime = []
    while now > today8am and now < today745pm:
        try:
            menu = input('Select an Option:\n1. Check in a customer.\n2. Checkout a customer.\n3. Clock-in a barber.\n4. Clock-out a barber.\n')
            if menu == '1':
                add1 = input('Who do you want to check in? ')
                print('The wait time is approximately', 12/len(barb) * len(cust) * len(barb), 'minutes.')
                cust.append(add1)
                custIndex = cust.index(add1)
                print(add1, 'was checked in at', datetime.datetime.now())
                custTime.append(datetime.datetime.now())
                if len(cust) == 0 and len(barb) == 0:
                    print('Nobody is in the shop.')
                elif len(cust) == 0 and len(barb) > 0:
                    print(barb, 'is/are in the shop')
                elif len(barb) == 0 and len(cust) > 0:
                    print(cust, 'is/are in the shop')
                else:
                    print(cust, 'and', barb, 'are in the shop.')    
            elif menu == '2':
                remove1 = input('Who do you want to check out? ')
                cust.remove(remove1)
                print(remove1, 'was checked out at', datetime.datetime.now())
                print(remove1, 'was waiting for', datetime.datetime.now()-custTime[custIndex], 'hours.')
                if len(cust) == 0 and len(barb) == 0:
                    print('Nobody is in the shop.')
                elif len(cust) == 0 and len(barb) > 0:
                    print(barb, 'is/are in the shop')
                elif len(barb) == 0 and len(cust) > 0:
                    print(cust, 'is/are in the shop')    
                else:
                    print(cust, 'and', barb, 'are in the shop.') 
            if menu == '3':
                add2 = input('Who do you want to clock-in? ')
                barb.append(add2)
                barbIndex = barb.index(add2)
                print(add2, 'was clocked-in at', datetime.datetime.now())
                barbTime.append(datetime.datetime.now())
                if len(cust) == 0 and len(barb) == 0:
                    print('Nobody is in the shop.')
                elif len(cust) == 0 and len(barb) > 0:
                    print(barb, 'is/are in the shop')
                elif len(barb) == 0 and len(cust) > 0:
                    print(cust, 'is/are in the shop')
                else:
                    print(cust, 'and', barb, 'are in the shop.')    
            elif menu == '4':
                remove2 = input('Who do you want to clock-out? ')
                barb.remove(remove2)
                print(remove2, 'was clocked-out at', datetime.datetime.now())
                print(remove2, 'worked for', datetime.datetime.now()-barbTime[barbIndex], 'hours.')
                if len(cust) == 0 and len(barb) == 0:
                    print('Nobody is in the shop.')
                elif len(cust) == 0 and len(barb) > 0:
                    print(barb, 'is/are in the shop')
                elif len(barb) == 0 and len(cust) > 0:
                    print(cust, 'is/are in the shop')
                else:
                    print(cust, 'and', barb, 'are in the shop.')
            if menu == 'done':
                if len(cust) == 0 and len(barb) == 0:
                    print('Nobody is in the shop.')
                elif len(cust) == 0 and len(barb) > 0:
                    print(barb, 'is/are in the shop')
                elif len(barb) == 0 and len(cust) > 0:
                    print(cust, 'is/are in the shop')
                else:
                    print(cust, 'and', barb, 'are still in the shop.')
                break
            continue
        except:
            error = input('That was an incorrect input, would you like to return to the menu? ')
            if error == 'yes':
                continue
            elif error == 'no':
                print('Done!!')
                quit(1)     
Shop()
