# makefile
#
# John Van Note
# 2016-12-27
#
# makefile for play-cards project
#

# tools
jv=java
jvc=javac

# directories
srcd=../src
bind=../bin

# package info
default=$(srcd)/com/jvn
cardp=$(default)/cards
gamep=$(default)/games

# Java
args=--classpath $(bind)

srcfiles = \
	$(cardp)/CardValue.java \
	$(cardp)/CardSuit.java \
	$(cardp)/Card.java \
	$(cardp)/Deck.java \
	$(cardp)/StandardDeck.java \
	$(gamep)/Hand.java \
	$(gamep)/PlayCards.java

run : compile
	echo "Nothing"

compile : 
	echo "Compiling sources..."
	for src in $(srcfiles); do \
	$(jv) $(args) $$src; \
	done

clean : 
	rm -rf $(bind)/*