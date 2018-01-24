package example.docljn.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Ignore;
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

    @Test @Ignore
    public void playerDrawsWithRock(){
        Player player = game.getPlayer();
        player.choose("Rock");
        // because we are not shuffling, we know that we will get "Rock" back
        game.choose();
        assertEquals("Draw", game.getResult());
    }

    @Test @Ignore
    public void playerWinsWithPaper(){
        Player player = game.getPlayer();
        player.choose("Paper");
        // because we are not shuffling, we know that we will get "Rock" back
        game.choose();
        assertEquals("Player Wins", game.getResult());
    }

    @Test @Ignore
    public void playerLosesWithScissors(){
        Player player = game.getPlayer();
        player.choose("Scissors");
        // because we are not shuffling, we know that we will get "Rock" back
        game.choose();
        assertEquals("Computer Wins", game.getResult());
    }

    @Test
    public void gameStartsWithZeroScores(){
        assertEquals(0, game.getPlayerScore());
        assertEquals(0, game.getComputerScore());
    }

    @Test
    public void winIncreasesScore(){
        
    }


}
