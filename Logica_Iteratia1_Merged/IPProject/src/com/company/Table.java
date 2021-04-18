package com.company;

import java.util.ArrayList;
import java.util.List;

/*
Cam ce ne-am gandit ca face clasa, ca implementare:

* primeste o lista de playeri, numarul playerilor, tipul de joc si instantiem deck.
* in constructor initializam toate cele de mai sus
* impartim cartile la playeri: pentru fiecare jucator, asignam PlayerHand-ul
* ne intereseaza si roundnumber-ul, pentru ca anumite jocuri vor avea un numar specific de ture
* am zis ca partea de joc ramane intr-un while continuu, dar tine de reguli

 */
public class Table {
    private List<Player> listOfPlayers;
    private List<PlayerHand> hands;
    Deck deck;
    private int numberOfPlayers;
    private int gameType;
    private int roundNumber;

    Table(){
    }

    Table(List<Player> Players, int numberOfPlayers, int gameType){
        this.listOfPlayers = Players;
        this.numberOfPlayers = numberOfPlayers;
        this.gameType = gameType;
        this.deck = new Deck();
        deck.shuffleDeck();
    }
//
    public void dealCards(){
        int numberOfCards = 52/numberOfPlayers;

        while(numberOfCards != 0) {
            for (int i = 0; i <= numberOfPlayers; i += 1) {
                Player myPlayer = listOfPlayers.get(i);
                myPlayer.hand = hands.get(i);
                myPlayer.hand.drawCard();
                listOfPlayers.set(i, myPlayer);
            }
            numberOfCards -= 1;
        }
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

//    while(true)
//    {
//        // jocul e in desfarurare
//    }

    // aici ar mai intra inca un while corespuzator cu turele playerilor

    /* in iteratia corespunzatoare o sa fie cat de cat functional, aici am facut arhitectura claselor, cumva foarte
    putin legate intre ele */
}
