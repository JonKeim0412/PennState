file1 = open('file.txt','r')
file2 = open('2.txt','w')
alpha = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'
text = file1.read()
try:
    key = int(input('What is your key? (1-26) '))
    text.lower()
    for i in text:
        if i.isalpha():
            print(alpha[alpha.index(i)+key], end='',file=file2)
except:
    print('Sorry, something went wrong')
file1.close()
file2.close()
