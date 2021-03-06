package com.company;

public class Hand extends CardCollection implements CardsRemovable{

    public Hand() {
        super();
    }

    @Override
    public void addCard(Card card) {
        if (cards.size() < 5) {
            cards.add(card);
        }
    }

    public Card dropCard() throws ArrayIndexOutOfBoundsException {
        return cards.remove(cards.size() - 1);
    }

    public Card dropCard(int cardPosition) throws ArrayIndexOutOfBoundsException {
        return cards.remove(cardPosition);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Cards in hand" + ":\n");
        s.append(super.toString());
        return s.toString();
    }
}
