import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void deckHas5ofSpades(){
        Card fiveOfSpades = new Card(Rank.FIVE, Suit.SPADES);
        assertEquals(true, deck.hasCard(fiveOfSpades));
    }

    @Test
    public void canGetCardFromDeck(){
        Card card = deck.getCardFromDeck(Rank.QUEEN, Suit.SPADES);
        assertEquals(Rank.QUEEN, card.getRank());
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void canRemoveCardFromDeck(){
        Card card = deck.getCardFromDeck(Rank.QUEEN, Suit.SPADES);
        deck.removeCardFromDeck(card);
        assertEquals(false, deck.hasCard(card));
    }

    @Test
    public void canShuffleDeck(){
        Card card = deck.getCardFromDeck(Rank.QUEEN, Suit.SPADES);
        int originalIndex = deck.getCards().indexOf(card);
        deck.shuffle();
        int newIndex = deck.getCards().indexOf(card);
        assertEquals(false, originalIndex == newIndex);
    }
}
