count = 0
total = 0
largest = None
smallest = None
keepgoing = True
while keepgoing:
  s = input('Enter a number: ')
  try:
     line = int(s)
     count = count + 1 
     total = total + line
     if smallest is None or line < smallest:
      smallest = line
     if largest is None or line > largest:
      largest = line
  except:
    if s == 'Done' or s == 'done':
      break
    else:
      print('Invalid Input')
      continue
print(count, largest, smallest)
