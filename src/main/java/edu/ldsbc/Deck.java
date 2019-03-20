package edu.ldsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements PDeck {

    List<PCard> deck = new ArrayList();

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void addCard(PCard card) {
        deck.add(card);

    }

    public PCard dealCard() {
        PCard dealCard = deck.get(-0);
        deck.remove(dealCard);
        return dealCard;
    }

    public PCard dealHiddenCard() {
        return null;
    }

    public int cardCount() {
        int count = 0;
        for (PCard card: deck) {
            count++;
        }
        return count;
    }



}
