grades = []
while True:
    grade = (input('What are the grades? '))
    if grade == 'done':
        break
    grades.append(int(grade))
maxGrade = max(grades)  
for i in grades:
    if i >= maxGrade - 10:
        print(i, 'is an A')
    elif i >= maxGrade - 20 and i < maxGrade - 10:
        print(i, 'is a B')
    elif i >= maxGrade - 30 and i < maxGrade - 20:
        print(i, 'is a C')
    elif i >= maxGrade - 40 and i < maxGrade - 30:
        print(i, 'is a D')
    else:
        print(i, 'is a F')
