package com.jvn.cards;

class StandardDeck extends Deck {
  public StandardDeck() {
    List<Cards> cards = new ArrayList<Cards>();
    List<CardSuit> suits = CardSuit.getSuits();
    List<CardValue> values = CardValue.getValues();

    for(int i=0; i<suits.length(); i++) {
      for(int j=0; i<values.length(); j++) {
        Card card = new Card(suits[i], values[j]);
        cards.add(card);
      }
    }

    super(cards);
  }
}
