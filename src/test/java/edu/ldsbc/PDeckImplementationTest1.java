package edu.ldsbc;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PDeckImplementationTest1 {
    // List<PCard> deck = new ArrayList();

    Deck deckTest = new Deck();
    // List<PCard> deck = new ArrayList();

    Card card = new Card(1, "heart");
    Card card1 = new Card(2,"spade");
    Card card2 = new Card(3,"club");
    Card card3 = new Card(4,"diamond");

    @Test
    void shuffle() {
        List<PCard> cards = new ArrayList();
        int count = 0;
        int elements = 0;

        deckTest.addCard(card);
        deckTest.addCard(card1);
        deckTest.addCard(card2);

        deckTest.shuffle();

        // verifies the  deck size after shuffle
        assertEquals(deckTest.cardCount(),3);

        // verifies deck elements after shuffle, if they are all still there
        do {
            if (deckTest.deck.get(count) == card || deckTest.deck.get(count) == card1 || deckTest.deck.get(count) == card2) {

                elements += 1;
                if(elements == 3) {
                    count = 5;
                }
            } else {
                count++;
            }
        } while (count < 4);

        assertEquals(3,elements);
    }

    @Test
    void addCard() {
        deckTest.addCard(card);
        deckTest.addCard(card1);
        deckTest.addCard(card2);
        deckTest.addCard(card3);

        assertEquals(deckTest.cardCount(),4);
    }

    @Test
    void dealCard() {
        deckTest.addCard(card);
        deckTest.addCard(card1);
        deckTest.addCard(card2);
        deckTest.addCard(card3);

        deckTest.dealCard();

        assertEquals(3,deckTest.cardCount());

    }

    @Test
    void dealHiddenCard() {
        assertEquals(null,deckTest.dealHiddenCard());
    }

    @Test
    void cardCount() {
        deckTest.addCard(card);
        deckTest.addCard(card1);
        deckTest.addCard(card2);

        assertEquals(deckTest.cardCount(),3);
    }
}