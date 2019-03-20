package edu.ldsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PHandImp implements PHand {

    List<PCard> cards = new ArrayList();

    @Override
    public int getSize() {
        return cards.size();
    }

    @Override
    public void addCard(PCard card) {
        cards.add(card);
    }

    @Override
    public PCard getCard(int index) {
        return cards.get(index);
    }

    @Override
    public PCard removeCard(int index) {
        return cards.remove(index);
    }

    @Override
    public int getValue() {
        int value = 0;

        for (PCard card: cards) {
            Card faceCard = (Card) card;

            // value += bestValue(value,faceCard.getNumber());
            value += faceCard.getNumber();
        }

        return value;
    }

    public int bestValue(int value, int number) {

        if (number == 1 && value <= 11) {
            return 11;
        } else if (number == 1 && value > 11) {
            return 1;
        } else if (number == 11 || number == 12 || number == 13) {
            return 10;
        } else {
            return number;
        }
    }
}
