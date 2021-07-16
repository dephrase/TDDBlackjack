import java.util.Random;

public class Dealer extends Person{

    public Dealer(){
    }

    @Override
    public void stickOrTwist() {

    }

    @Override
    public String getName() {
        return "Dealer";
    }

    public void dealPlayerFirstCards(Deck deck, Player player){
        for(int i = 0; i < 2; i++){
            player.addCardToHand(deck.getNextCard());
        }
    }

    public void dealDealerFirstCards(Deck deck, Dealer dealer){
        for(int i = 0; i < 2; i++){
            dealer.addCardToHand(deck.getNextCard());
        }
    }
}
