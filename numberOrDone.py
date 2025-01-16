total = 0
count = 0
while True:
        try:
            s = input('Enter a numer or done: ')
            if s == 'done':
                            break
            t = int(s)
            total = total + t
            count = count + 1 
            print(total)
        except:
            if s != 'done' and s != int:
                print('bad input')
                continue
print('Done!', total, count, count/total)
