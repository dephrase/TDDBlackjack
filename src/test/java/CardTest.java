import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp(){
        card = new Card(Rank.QUEEN, Suit.HEARTS);
    }

    @Test
    public void cardHasRank(){
        assertEquals(Rank.QUEEN, card.getRank());
    }

    @Test
    public void cardHasSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void cardHasValue(){
        assertEquals(10, card.getValueOfRank());
    }


}
