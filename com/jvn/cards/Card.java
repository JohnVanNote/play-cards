// Card.java

package com.jvn.cards;

public class Card {
	private CardValue value;
	private CardSuit suit;	
	
	public Card(CardValue value, CardSuit suit) {
		this.setValue(value);
		this.setSuit(suit);
	}

	public void setValue(CardValye value) {
		this.value = value;
	}

	public void setSuit(CardSuit suit)	{
		this.suit = suit;
	}
	
	public CardValue getValue() {
		return this.value;
	}
	
	public CardSuit getSuit() {
		return this.suit;
	}
}
