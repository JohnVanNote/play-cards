#!/usr/bin/env python
#
# John Van Note
# 2017-01-22
# 
# Script dynamically makes deck of cards
#

# Makes card files
def cards():
    reldir = './resources/' 
    carddir = './cards/'
    
    form = slurp_file(reldir + 'ascii-card.txt')
    suits = slurp_file(reldir + 'suits-alt.txt')
    values = slurp_file(reldir + 'values.txt')
    suits = suits.splitlines()
    values = values.splitlines()
    
    for suit in suits:
        for value in values:
            card = form
            if value != '10':
                card = card.replace('X', value).replace('Y', suit)
            else:
                card = card.replace('X ', value).replace('Y', suit)
            xfile = file(carddir + value + suit + '.card', 'w')
            xfile.write(card)
            xfile.close()
    return

# Helper to slurp file contents into a string
# @return: The file contents
def slurp_file(filepath):
    xfile = file(filepath, 'r')
    return xfile.read()


if __name__ == '__main__':
    cards()
