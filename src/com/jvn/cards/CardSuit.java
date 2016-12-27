// CardSuit.java

package com.jvn.cards;

import java.util.List;
import java.util.ArrayList;

public enum CardSuit {
	HEART,
	SPADE,
	DIAMOND,
	CLUB;

  public List<CardSuit> getSuits() {
    List<CardSuit> suits = new ArrayList<CardSuit>();
    suits.add(CardSuit.HEART);
    suits.add(CardSuit.SPADE);
    suits.add(CardSuit.DIAMOND);
    suits.add(CardSuit.CLUB);
    return suits;
  }
}
