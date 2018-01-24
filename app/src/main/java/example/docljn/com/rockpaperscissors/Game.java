package example.docljn.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lornanoble on 24/01/2018.
 */

class Game {
    private final ArrayList<String> choices;
    private String hand;

    public Game() {
        choices = new ArrayList<>();
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");
        this.hand = null;
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public void choose() {
        Collections.shuffle(choices);
        this.hand = choices.get(0);
    }

    public String getHand() {
        return hand;
    }
}
