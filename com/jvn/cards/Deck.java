package com.jvn.cards;

import java.util.List;

class Deck {
  protected List<Card> cards;

  public Deck() {}

  public Deck(List<Card> cards) {
   this.setCards(cards);
  }

  public List<Card> getCards() {
    return this.cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }
}
