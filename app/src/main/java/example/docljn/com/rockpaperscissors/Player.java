package example.docljn.com.rockpaperscissors;

/**
 * Created by lornanoble on 24/01/2018.
 */

class Player {

    private String hand;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = null;
    }

    public void choose(String choice) {
        this.hand = choice;
    }

    public String getHand() {
        return this.hand;
    }
}
