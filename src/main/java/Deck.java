import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public boolean hasCard(Card targetCard) {
        Boolean found = false;
        for(Card card: cards){
            if(card.getRank() == targetCard.getRank() && card.getSuit() == targetCard.getSuit()){
                found = true;
            }
        }
        return found;
    }

    public Card getCardFromDeck(Rank targetRank, Suit targetSuit) {
        Card result = null;
        for(Card card: cards){
            if(card.getRank() == targetRank && card.getSuit() == targetSuit){
                result = card;
            }
        }
        return result;
    }

    public void removeCardFromDeck(Card targetCard) {
        cards.removeIf(card -> card.getRank() == targetCard.getRank() && card.getSuit() == targetCard.getSuit());
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getNextCard(){
        Card card = cards.get(0);
        return card;
    }
}
