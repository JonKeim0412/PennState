def reverse(lst):
        new_lst = lst[::-1]
        return new_lst
lst = []
while True:
    list1 = input('Enter a number: ')
    if list1 == 'done':
        break
    lst.append(int(list1))
for i in range(len(lst)):
    print(lst[i])
print(reverse(lst))
