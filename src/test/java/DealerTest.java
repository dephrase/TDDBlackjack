import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setup(){
        Deck deck = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void dealerIsCalledDealer(){
        assertEquals("Dealer", dealer.getName());
    }

    @Test
    public void dealStartsWithEmptyHand(){
        assertEquals(0, dealer.getHand().size());
    }

    @Test
    public void dealerCanDealTwoCardsToPlayer(){
        Player player = new Player("David");
        Deck deck = new Deck();
        deck.shuffle();
        dealer.dealPlayerFirstCards(deck, player);
        assertEquals(2, player.getHand().size());
    }

    @Test
    public void dealerCanDealHimselfTwoCards(){
        Deck deck = new Deck();
        deck.shuffle();
        dealer.dealDealerFirstCards(deck, dealer);
        assertEquals(2, dealer.getHand().size());
    }

}
