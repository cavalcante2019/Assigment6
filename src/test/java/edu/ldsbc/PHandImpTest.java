package edu.ldsbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PHandImpTest {

    PHandImp hand = new PHandImp();

    @Test
    void getSize() {
        hand.addCard(new Card(1, "heart"));
        hand.addCard(new Card(1, "club"));
        hand.addCard(new Card(1, "diamond"));
        hand.addCard(new Card(1, "spade"));

        assertEquals(hand.getSize(),4);
    }

    @Test
    void addCard() {
        // testing value added
        hand.addCard(new Card(13, "heart"));
        assertEquals(hand.getCard(0).getText(),"K\u2661");

        // testing number of cards added
        hand.addCard(new Card(8, "heart"));
        assertEquals(hand.getSize(),2);

    }

    @Test
    void getCard() {
        hand.addCard(new Card(1, "heart"));
        hand.addCard(new Card(1, "club"));
        hand.addCard(new Card(1, "diamond"));
        hand.addCard(new Card(1, "spade"));

        assertEquals(hand.getCard(0).getText(),"A\u2661");
    }

    @Test
    void removeCard() {
        // Add cards and test if all of them were added
        hand.addCard(new Card(13, "heart"));
        hand.addCard(new Card(1, "spade"));
        hand.addCard(new Card(8, "heart"));
        assertEquals(hand.getSize(),3);

        // tests the removal by verifying the size and the new element poision after the previous being removed
        hand.removeCard(1);
        assertEquals(hand.getSize(),2);
        assertEquals(hand.getCard(1).getText(),"8\u2661");
    }

    @Test
    void getValue() {
        hand.addCard(new Card(12, "heart"));
        hand.addCard(new Card(1, "spade"));
        hand.addCard(new Card(8, "heart"));

        assertEquals(hand.getValue(),21);
    }
}