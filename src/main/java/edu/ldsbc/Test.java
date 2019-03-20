package edu.ldsbc;

public class Test {

    public static void main(String[] args) {
        PHand hand = new PHandImp();
        PDeckImplementation deck = new PDeckImplementation();

        deck.implement();

        HandTest.run(deck,hand);
    }
}
