package example.docljn.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lornanoble on 24/01/2018.
 */

class Game {
    private final ArrayList<String> choices;
    private String hand;
    private Player player;
    private int playerScore;
    private int computerScore;

    public Game() {
        choices = new ArrayList<>();
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");
        this.hand = null;
        this.player = new Player();
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public void choose() {
        Collections.shuffle(choices);
        this.hand = choices.get(0);
    }

    public String getHand() {
        return this.hand;
    }

    public String getResult() {
        this.choose();
        String playerChoice = player.getHand();
        String computerChoice = this.getHand();
        String result = playerChoice + computerChoice;

        if (playerChoice == computerChoice) {
            return "Draw";
        } else if (result.equals("ScissorsPaper")) {
            return "Player Wins";
        } else if (result.equals("RockScissors")) {
            return "Player Wins";
        } else if (result.equals("PaperRock")) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }

    }

    public Player getPlayer() {
        return this.player;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public int getComputerScore() {
        return this.computerScore;
    }
}
