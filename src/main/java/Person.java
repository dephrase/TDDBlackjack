import java.util.ArrayList;

public abstract class Person {

    private ArrayList<Card> hand;

    public Person(){
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public abstract void stickOrTwist();

    public abstract String getName();

    public void addCardToHand(Card card){
        hand.add(card);
    }
}
