package edu.ldsbc;

public class Card extends PCard {
    //black clubs unicode \u2663 white \u2667
    //black heart unicode \u2665 white \u2661
    //black diamond unicode \u2666 white \u2662
    //black spade unicode \u2660 white \u2664

    int number;
    String literal;
    String symbol;

    public int getNumber() {
        return number;
    }

    public String getLiteral() {
        return literal;
    }

    public String getSymbol() {
        return symbol;
    }

    Card(int number, String type){
        String numeric = "";

        this.number = number;

        if(number == 1)
            numeric = "A";
        else if(number == 2)
            numeric = "2";
        else if(number == 3)
            numeric = "3";
        else if(number == 4)
            numeric = "4";
        else if(number == 5)
            numeric = "5";
        else if(number == 6)
            numeric = "6";
        else if(number == 7)
            numeric = "7";
        else if(number == 8)
            numeric = "8";
        else if(number == 9)
            numeric = "9";
        else if(number == 10)
            numeric = "10";
        else if(number == 11)
            numeric = "J";
        else if(number == 12)
            numeric = "Q";
        else if(number == 13) // this is ME
            numeric = "K";

        // The Card Suits
        if (type=="club")
            literal="\u2663";
        else if (type=="spade")
            literal="\u2660";
        else if (type=="heart")
            literal="\u2661";
        else if (type=="diamond")
            literal="\u2662";

        symbol = numeric + "" + literal;
    }

    @Override
    public String getText() {
        return symbol;
    }

}



