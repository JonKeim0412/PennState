import random
randNum = []
for i in range(500):
    randNum.append(random.randint(1,100))
avg = (sum(randNum)/len(randNum))
print(avg)
for i in randNum:
    if i > avg*2:
        print(i)

