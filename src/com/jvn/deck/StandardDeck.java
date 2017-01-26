package com.jvn.cards;

import java.util.List;
import java.util.ArrayList;

class StandardDeck extends Deck {
  public StandardDeck() {
    List<Card> cards = new ArrayList<Card>();
    List<CardSuit> suits = CardSuit.getSuits();
    List<CardValue> values = CardValue.getValues();

    for(int i=0; i<suits.size(); i++) {
      for(int j=0; i<values.size(); j++) {
        Card card = new Card(values.get(j), suits.get(i));
        cards.add(card);
      }
    }

    this.setCards(cards);
  }
}
