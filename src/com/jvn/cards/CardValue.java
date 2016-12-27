// CardValue.java

package com.jvn.cards;

import java.util.List;
import java.util.ArrayList;

public enum CardValue {
	ACE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	JACK,
	QUEEN,
  KING;

  public List<CardValue> getValues() {
    List<CardValue> values = new ArrayList<CardValue>();
    values.add(CardValue.ACE);
    values.add(CardValue.TWO);
    values.add(CardValue.THREE);
    values.add(CardValue.FOUR);
    values.add(CardValue.FIVE);
    values.add(CardValue.SIX);
    values.add(CardValue.SEVEN);
    values.add(CardValue.EIGHT);
    values.add(CardValue.NINE);
    values.add(CardValue.TEN);
    values.add(CardValue.JACK);
    values.add(CardValue.QUEEN);
    values.add(CardValue.KING);
    return values;
  }
}
