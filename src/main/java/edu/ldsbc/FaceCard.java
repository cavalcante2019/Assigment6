package edu.ldsbc;

import java.util.Random;

public class FaceCard extends PCard {
    // The min and max valid card ranks
    private static final int MIN_RANK = 1;
    private static final int MAX_RANK = 13;

    Random generator = new Random();

    public String getText() {
        return "5\u2605";
    }

    public int getRank() {
        return generator.nextInt((MAX_RANK - MAX_RANK) + 1) + 1;
    }


}

