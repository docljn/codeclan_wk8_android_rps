package example.docljn.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    Game game;
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        game = new Game();
        player = game.getPlayer();

    }

    public void onRockButtonClicked(View button){
        String playerChoice = "Rock";
        player.choose(playerChoice);
        String result = game.getResult();

        String computerChoice = game.getHand();


        




    }
}
