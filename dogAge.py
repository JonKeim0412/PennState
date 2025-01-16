def calculator():
    age = input("Input dog years: ")
    try:
        d_age = float(age)
        if(d_age < 0):
            print("Age can not be a negative number", age)
        elif(d_age == 1):
            d_age = 15
        elif(d_age == 2):
            d_age = 2 * 12
        elif(d_age == 3):
            d_age = 3 * 9.3
        elif(d_age == 4):
            d_age = 4 * 8
        elif(d_age == 5):
            d_age = 5 * 7.2
        else:
            d_age = 5 * 7.2 + (float(age) - 5) * 7
        print("\n \t \'The given dog age", age, "is", d_age, "human years.'")
    except ValueError:
            print(age, "is an invalid age")
