package edu.ldsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PDeckImplementation implements PDeck {
    List<Card> cards = new ArrayList<Card>();
    List<PCard> deck = new ArrayList();

    public PDeckImplementation() {
        cards.add(new Card(1,"club"));
        cards.add(new Card(2,"club"));
        cards.add(new Card(3,"club"));
        cards.add(new Card(4,"club"));
        cards.add(new Card(5,"club"));
        cards.add(new Card(6,"club"));
        cards.add(new Card(7,"club"));
        cards.add(new Card(8,"club"));
        cards.add(new Card(9,"club"));
        cards.add(new Card(10,"club"));
        cards.add(new Card(11,"club"));
        cards.add(new Card(12,"club"));
        cards.add(new Card(13,"club"));

        cards.add(new Card(1,"heart"));
        cards.add(new Card(2,"heart"));
        cards.add(new Card(3,"heart"));
        cards.add(new Card(4,"heart"));
        cards.add(new Card(5,"heart"));
        cards.add(new Card(6,"heart"));
        cards.add(new Card(7,"heart"));
        cards.add(new Card(8,"heart"));
        cards.add(new Card(9,"heart"));
        cards.add(new Card(10,"heart"));
        cards.add(new Card(11,"heart"));
        cards.add(new Card(12,"heart"));
        cards.add(new Card(13,"heart"));

        cards.add(new Card(1,"spade"));
        cards.add(new Card(2,"spade"));
        cards.add(new Card(3,"spade"));
        cards.add(new Card(4,"spade"));
        cards.add(new Card(5,"spade"));
        cards.add(new Card(6,"spade"));
        cards.add(new Card(7,"spade"));
        cards.add(new Card(8,"spade"));
        cards.add(new Card(9,"spade"));
        cards.add(new Card(10,"spade"));
        cards.add(new Card(11,"spade"));
        cards.add(new Card(12,"spade"));
        cards.add(new Card(13,"spade"));

        cards.add(new Card(1,"diamond"));
        cards.add(new Card(2,"diamond"));
        cards.add(new Card(3,"diamond"));
        cards.add(new Card(4,"diamond"));
        cards.add(new Card(5,"diamond"));
        cards.add(new Card(6,"diamond"));
        cards.add(new Card(7,"diamond"));
        cards.add(new Card(8,"diamond"));
        cards.add(new Card(9,"diamond"));
        cards.add(new Card(10,"diamond"));
        cards.add(new Card(11,"diamond"));
        cards.add(new Card(12,"diamond"));
        cards.add(new Card(13,"diamond"));
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public void addCard(PCard card) {
        deck.add(card);
    }

    @Override
    public PCard dealCard() {
        PCard dealtCard = deck.get(-0);
        deck.remove(dealtCard);
        return dealtCard;
    }

    @Override
    public PCard dealHiddenCard() {
        return null;
    }

    @Override
    public int cardCount() {
        int counter = 0;
        for (PCard card : deck) {
            counter++;
        }
        return counter;
    }

    public void implement() {

        // club

        Card card = new Card(1, "club");
        CardTest cardTest = new CardTest(card);
        addCard(card);

        Card card2 = new Card(2,"club");
        addCard(card2);

        Card card3 = new Card(3,"club");
        addCard(card3);

        Card card4 = new Card(4,"club");
        addCard(card4);

        Card card5 = new Card(5,"club");
        addCard(card5);

        Card card6 = new Card(6,"club");
        addCard(card6);

        Card card7 = new Card(7,"club");
        addCard(card7);

        Card card8 = new Card(8,"club");
        addCard(card8);

        Card card9 = new Card(9,"club");
        addCard(card9);

        Card card10 = new Card(10,"club");
        addCard(card10);

        Card card11 = new Card(11,"club");
        addCard(card11);

        Card card12 = new Card(12,"club");
        addCard(card12);

        Card card13 = new Card(13,"club");
        addCard(card13);


        // spade

        Card card15 = new Card(1,"spade");
        addCard(card15);

        Card card16 = new Card(2,"spade");
        addCard(card16);

        Card card17 = new Card(3,"spade");
        addCard(card17);

        Card card18 = new Card(4,"spade");
        addCard(card18);

        Card card19 = new Card(5,"spade");
        addCard(card19);

        Card card20 = new Card(6,"spade");
        addCard(card20);

        Card card21 = new Card(7,"spade");
        addCard(card21);

        Card card22 = new Card(8,"spade");
        addCard(card22);

        Card card23 = new Card(9,"spade");
        addCard(card23);

        Card card24 = new Card(10,"spade");
        addCard(card24);

        Card card25 = new Card(11,"spade");
        addCard(card25);

        Card card26 = new Card(12,"spade");
        addCard(card26);

        Card card27 = new Card(13,"spade");
        addCard(card27);

        // diamond

        Card card29 = new Card(1,"diamond");
        addCard(card29);

        Card card30 = new Card(2,"diamond");
        addCard(card30);

        Card card31 = new Card(3,"diamond");
        addCard(card31);

        Card card32 = new Card(4,"diamond");
        addCard(card32);

        Card card33 = new Card(5,"diamond");
        addCard(card33);

        Card card34 = new Card(6,"diamond");
        addCard(card34);

        Card card35 = new Card(7,"diamond");
        addCard(card35);

        Card card36 = new Card(8,"diamond");
        addCard(card36);

        Card card37 = new Card(9,"diamond");
        addCard(card37);

        Card card38 = new Card(10,"diamond");
        addCard(card38);

        Card card39 = new Card(11,"diamond");
        addCard(card39);

        Card card40 = new Card(12,"diamond");
        addCard(card40);

        Card card41 = new Card(13,"diamond");
        addCard(card41);

        // heart

        Card card43 = new Card(1,"heart");
        addCard(card43);

        Card card44 = new Card(2,"heart");
        addCard(card44);

        Card card45 = new Card(3,"heart");
        addCard(card45);

        Card card46 = new Card(4,"heart");
        addCard(card46);

        Card card47 = new Card(5,"heart");
        addCard(card47);

        Card card48 = new Card(6,"heart");
        addCard(card48);

        Card card49 = new Card(7,"heart");
        addCard(card49);

        Card card50 = new Card(8,"heart");
        addCard(card50);

        Card card51 = new Card(9,"heart");
        addCard(card51);

        Card card52 = new Card(10,"heart");
        addCard(card52);

        Card card53 = new Card(11,"heart");
        addCard(card53);

        Card card54 = new Card(12,"heart");
        addCard(card54);

        Card card55 = new Card(13,"heart");
        addCard(card55);
    }

}
