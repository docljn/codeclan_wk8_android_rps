package example.docljn.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by lornanoble on 24/01/2018.
 */

public class GameTest {


    private Game game;

    @Before
    public void before(){
    game = new Game();

    }

    @Test
    public void canGetChoices(){
        assertEquals("Rock", game.getChoices().get(0));
    }

    @Test
    public void canGetComputerChoice(){
        game.choose();
        assertNotNull(game.getHand());
    }


}
