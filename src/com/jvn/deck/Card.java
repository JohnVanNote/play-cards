/**
 * Card.java
 *
 * John Van Note
 * 2017-01-25
 *
 * Card represents a playing card
 */

package com.jvn.deck;

public class Card<V, S> extends AbstractCard {
	protected V value;
	protected S suit;

    /**
     * Constructor: Must have a value and a Suit
     */
	public Card(V value, S suit) {
		this.setValue(value);
		this.setSuit(suit);
	}

    /**
     * Mutator: For value
     */
	public void setValue(V value) {
		this.value = value;
	}

    /**
     * Mutator: For suit
     */ 
	public void setSuit(S suit)	{
		this.suit = suit;
	}

    /**
     * Accessor: Returns value field
     * @return: The value field
     */
	public V getValue() {
		return this.value;
	}

    /**
     * Accessor: Returns the suit field
     */
	public S getSuit() {
		return this.suit;
	}
}
