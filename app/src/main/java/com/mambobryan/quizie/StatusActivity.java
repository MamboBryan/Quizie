package com.mambobryan.quizie;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import io.rmiri.buttonloading.ButtonLoading;
import io.rmiri.buttonloading.ButtonLoadingAttribute;

public class StatusActivity extends AppCompatActivity {

    int playScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        String playerScoreQuiz = getIntent().getStringExtra("score");
        playScore = Integer.parseInt(playerScoreQuiz);
        String completeScore = String.valueOf(playScore);


        if (playScore >= 0 && playScore <= 20) {
            //avatar.setImageResource(R.drawable.novice);
            // playerScore.setText(score);
            //level.setText("Novice");
            //exp.setText("2000");

        }


    }

    public void seeScore(View v){
        TextView title = findViewById(R.id.titleEditTextStatus);
        String totalScore = String.valueOf(playScore);
        TextView score = findViewById((R.id.scoreEditTect));
        TextView level = findViewById(R.id.levelEditText);

       if (playScore >= 0 && playScore <= 20) {

           title.setText("Babypool Diver");

           score.setText("Score : " + totalScore);

           level.setText("LEvel : Novice");

        }

        if (playScore > 20 && playScore <= 70) {

            title.setText("Ocean Tamer");

            score.setText("Score : " + totalScore);

            level.setText("LEvel : Intermediate");

        }

        if (playScore > 70 && playScore <= 100) {

            title.setText("Pirate King");

            score.setText("Score : " + totalScore);

            level.setText("LEvel : Pro");

        }

        if (playScore < 0) {

            title.setText("Drowning Guru");

            score.setText("Score : " + totalScore);

            level.setText("Level : Beginner");

        }


    }

    public void playGame(View view) {

        Intent intent = new Intent(StatusActivity.this, MainActivity.class);
        startActivity(intent);

    }

}
