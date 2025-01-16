list1 = []
list2 = []
count = 0
total = 0
largest = None
smallest = None
cont = True
while cont:
    input1 = input('Enter an integer or nonnumerical value: ')
    if input1.isnumeric() == True:
        line = int(input1)
        count = count + 1 
        total = total + line
        if smallest is None or line < smallest:
            smallest = line
        if largest is None or line > largest:
            largest = line
        avg = count/total
        print(total)
    elif input1.isnumeric() == False:
        list2.append(input1)
        list2.sort()
    if input1 == 'done':
        list1.append(smallest)
        list1.append(largest)
        list1.append(avg)
        list1.append(total)
        break
print('Done!!', list1, list2)
