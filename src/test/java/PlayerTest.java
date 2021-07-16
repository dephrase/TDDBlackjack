import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Person player;

    @Before
    public void setUp(){
        player = new Player("David");
    }

    @Test
    public void playerHasName(){
        assertEquals("David", player.getName());
    }

    @Test
    public void playerStartsWithEmptyHand(){
        assertEquals(0, player.getHand().size());
    }

}
