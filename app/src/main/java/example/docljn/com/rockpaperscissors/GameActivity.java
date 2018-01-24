package example.docljn.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game;
    Player player;
    String result;
    String computerChoice;
    String playerChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        // TODO: think about whether this should be in each buttonclick bit
        game = new Game();
        player = game.getPlayer();

    }



    public void displayResults(){
        TextView playerChoiceText = findViewById(R.id.player_choice_text);
        playerChoiceText.setText("Player chose " + playerChoice);

        TextView computerChoiceText = findViewById(R.id.computer_choice_text);
        computerChoiceText.setText("Computer chose " + computerChoice);

        TextView resultText = findViewById(R.id.result_text);
        resultText.setText(result);
    }



    public void onRockButtonClicked(View button){
        playerChoice = "Rock";
        player.choose(playerChoice);
        result = game.getResult();
        computerChoice = game.getHand();
        this.displayResults();
    }

    public void onPaperButtonClicked(View button){
        playerChoice = "Paper";
        player.choose(playerChoice);
        result = game.getResult();
        computerChoice = game.getHand();
        this.displayResults();
    }

    public void onScissorsButtonClicked(View button){
        playerChoice = "Scissors";
        player.choose(playerChoice);
        result = game.getResult();
        computerChoice = game.getHand();
        this.displayResults();
    }


}
