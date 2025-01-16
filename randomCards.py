import random

deck = ['Spades','Hearts','Diamonds','Clubs']
cards = ['Ace', 'King', 'Queen', 'Jack', '10', '9', '8', '7', '6', '5', '4', '3', '2']
    
random.shuffle(deck)

print('You got:')
for i in range(len(deck)):
   print('The', cards[i][0], 'of', deck[i][1])
