package com.company;

public class Card {
    private int number, color;

    public Card(int number, int color) {
        if (number < 2 || number > 14 || color < 1 || color > 4) {
            System.out.println("Invalid card");
        } else {
            this.number = number;
            this.color = color;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + number + ',' + color + '}';
    }
}


/*

public class Main {

    public static void main(String[] args) {
	 PlayerHand p1 = new PlayerHand();
	 p1.makeDeck();
     p1.setInitialNumber(5);
     p1.drawInitialCards();
     p1.printCards();
     p1.drawCard();
     p1.printCards();
     p1.putCard(3);
     p1.printCards();
     p1.setTurn();
     System.out.println(p1.getTurn());
    }
}


 */