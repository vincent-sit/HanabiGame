package com.company;

public class Firework extends CardCollection{
    private final String color;
    private boolean completed;
    private int nextValueExpected;

    public Firework(String color) {
        super();
        this.color = color;
        this.completed = false;
        this.nextValueExpected = 1;
    }

    public boolean checkCompletedStatus() {
        if(nextValueExpected > 5) {
            completed = true;
        }
        return completed;
    }

    public String getColor() {
        return color;
    }

    public int getNextValueExpected() {
        return nextValueExpected;
    }

    @Override
    public void addCard(Card card){

        if(nextValueExpected <= 5) {
            cards.add(card);
            nextValueExpected++;
        } else {
            System.out.println("Firework collection complete. Cannot add more cards.");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(color).append(": ");
        if(cards.size() == 0) {
            s.append("None");
        }
        for(Card card : cards) {
            s.append(card.getCardValue()).append(" ");
        }
        return s.toString();
    }
}
