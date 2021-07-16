import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;

    @Before
    public void setup(){
        player = new Player("David");
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        game = new Game(player, dealer, deck);
    }

    @Test
    public void gameHasPlayer(){
        assertEquals("David", game.getPlayer().getName());
    }

    @Test
    public void gameHasDealer(){
        assertEquals("Dealer", game.getDealer().getName());
    }

    @Test
    public void gameHasDeck(){
        assertEquals(52, game.getDeck().getCards().size());
    }

    @Test
    public void gameCondition21(){
        Card ace = new Card(Rank.ACE, Suit.SPADES);
        Card queen = new Card(Rank.QUEEN, Suit.DIAMONDS);
        player.addCardToHand(ace);
        player.addCardToHand(queen);
        assertEquals("Win", game.checkWinCondition(player));
    }

    @Test
    public void gameConditionContinue(){
        Card ace = new Card(Rank.ACE, Suit.SPADES);
        Card two = new Card(Rank.TWO, Suit.DIAMONDS);
        player.addCardToHand(ace);
        player.addCardToHand(two);
        assertEquals("Continue", game.checkWinCondition(player));
    }

    @Test
    public void gameConditionBust(){
        Card ace = new Card(Rank.ACE, Suit.SPADES);
        Card queen = new Card(Rank.TWO, Suit.DIAMONDS);
        Card king = new Card(Rank.KING, Suit.SPADES);
        player.addCardToHand(ace);
        player.addCardToHand(queen);
        player.addCardToHand(king);
        assertEquals("Bust", game.checkWinCondition(player));
    }

    @Test
    public void playerCanTwist(){
        Card three = new Card(Rank.THREE, Suit.SPADES);
        Card two = new Card(Rank.TWO, Suit.DIAMONDS);
        player.addCardToHand(three);
        player.addCardToHand(two);
        game.askPlayerStickOrTwist("Twist", player);
        assertEquals(3, player.getHand().size());
    }

    @Test
    public void playerCanStand(){
        Card three = new Card(Rank.THREE, Suit.SPADES);
        Card two = new Card(Rank.TWO, Suit.DIAMONDS);
        player.addCardToHand(three);
        player.addCardToHand(two);
        game.askPlayerStickOrTwist("Stand", player);
        assertEquals(2, player.getHand().size());
    }
}
