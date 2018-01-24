package example.docljn.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lornanoble on 24/01/2018.
 */

class Game {
    private final ArrayList<String> choices;

    public Game() {
        choices = new ArrayList<>();
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public String choose() {
        Collections.shuffle(choices);
        System.out.println(choices);
        return choices.get(0);


    }
}
