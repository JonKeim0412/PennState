def convert():
    unit1 = input('What unit to you want to convert from?')
    unit2 = input('What unit to you want to convert to?')
    num1 = int(input('What is the value of unit1?'))
    if unit1 == "cm" and unit2 == "m":
        ans = float(num1)/100
        print(ans)
    elif unit1 == "cm" and unit2 == "mm":
        ans = float(num1)*10
        print(ans)
    elif unit1 == "mm" and unit2 == "cm":
        ans = float(num1)/10
        print(ans)
    elif unit1 == "mm" and unit2 == "m":
        ans = float(num1)/1000
        print(ans)
    elif unit1 == "mm" and unit2 == "km":
        ans = float(num1)/1000000
        print(ans)
    elif unit1 == "m" and unit2 == "cm":
        ans = float(num1)*100
        print(ans)
    elif unit1 == "m" and unit2 == "mm":
        ans = float(num1)*1000
        print(ans)
    elif unit1 == "m" and unit2 == "km":
        ans = float(num1)/1000
        print(ans)
    elif unit1 == "km" and unit2 == "m":
        ans = float(num1)*1000
        print(ans)
    elif unit1 == "ft" and unit2 == "cm":
        ans = float(num1)*30.48
        print(ans)
    elif unit1 == "ft" and unit2 == "mm":
        ans = float(num1)*304.8
        print(ans)
    elif unit1 == "ft" and unit2 == "inch":
        ans = float(num1)*12
        print(ans)
    elif unit1 == "ft" and unit2 == "km":
        ans = float(num1)/3281
        print(ans)
    elif unit1 == "inch" and unit2 == "cm":
        ans = float(num1)*2.54
        print(ans)
    elif unit1 == "inch" and unit2 == "mm":
        ans = float(num1)*25.4
        print(ans)
    elif unit1 == "yd" and unit2 == "mm":
        ans = float(num1)*914
        print(ans)
    elif unit1 == "yd" and unit2 == "in":
        ans = float(num1)*36
        print(ans)
    elif unit1 == "yd" and unit2 == "km":
        ans = float(num1)/1094
        print(ans)
    elif unit1 == "yd" and unit2 == "mi":
        ans = float(num1)/1760
        print(ans)
    elif unit1 == "yd" and unit2 == "m":
        ans = float(num1)/1.094
        print(ans)
    elif unit1 == "yd" and unit2 == "":
        ans = float(num1)*91.44
        print(ans)
    elif unit1 == "yd" and unit2 == "m":
        ans = float(num1)/1.094
        print(ans)
    elif unit1 == "mi" and unit2 == "km":
        ans = float(num1)*1.609
        print(ans)
    elif unit1 == "mi" and unit2 == "m":
        ans = float(num1)*1609
        print(ans)
    elif unit1 == "mi" and unit2 == "cm":
        ans = float(num1)*160934
        print(ans)
    elif unit1 == "mi" and unit2 == "mm":
        ans = float(num1)*1609000
        print(ans)
    elif unit1 == "mi" and unit2 == "yd":
        ans = float(num1)*1760
        print(ans)
    elif unit1 == "mi" and unit2 == "ft":
        ans = float(num1)*5280
        print(ans)
    elif unit1 == "mi" and unit2 == "in":
        ans = float(num1)*63360
        print(ans)
