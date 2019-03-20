package CardGame;

import plumb.PDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements PDeck {



    List<MyCard> cards = new ArrayList<>();

    public Deck(){
        for(MyCard.Suite suite:MyCard.Suite.values()){
            for(MyCard.Rank rank: MyCard.Rank.values()){
                cards.add(new MyCard(rank,suite));
            }
        }
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void addCard(plumb.PCard card) {

    }



    public MyCard dealCard() {
        MyCard item = cards.get(cards.size()-1);
        cards.remove(item);
        return item;

    }

    public MyCard dealHiddenCard() {

        return null;
    }

    public int cardCount() {
        return cards.size();

      //  for (PCard card : deck) {
       //     counter++;
      //  }

      //  return counter;
    }
}