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
        assertNotNull(game.choose());
    }

    // TODO: should the game have a 'hand' as well, so we can reference it when calculating the winner?

}
