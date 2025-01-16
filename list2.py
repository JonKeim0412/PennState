## ask the user for items. Print items
items = []
while True:
    item = input('Enter an item or q to quit: ')
    if item == 'q':
        break
    items.append(item)
for i in range(len(items)):
    print(items[i])
