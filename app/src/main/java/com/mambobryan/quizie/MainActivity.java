package com.mambobryan.quizie;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int playerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void processScore(View view){

        RadioButton radioOneCorrect = findViewById(R.id.oneCorrect);
        boolean oneIsCorrect = radioOneCorrect.isChecked();
        if(oneIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioTwoCorrect = findViewById(R.id.twoCorrect);
        boolean twoIsCorrect = radioTwoCorrect.isChecked();
        if(twoIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioThreeCorrect = findViewById(R.id.threeCorrect);
        boolean threeIsCorrect = radioThreeCorrect.isChecked();
        if(threeIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioFourCorrect = findViewById(R.id.fourCorrect);
        boolean fourIsCorrect = radioFourCorrect.isChecked();
        if(fourIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioFiveCorrect = findViewById(R.id.fiveCorrect);
        boolean fiveIsCorrect = radioFiveCorrect.isChecked();
        if(fiveIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioSixCorrect = findViewById(R.id.sixCorrect);
        boolean sixIsCorrect = radioSixCorrect.isChecked();
        if(sixIsCorrect){
            playerScore += 5;
        }else {
            playerScore -= 5;
        }

        RadioButton radioSevenCorrect = findViewById(R.id.sevenCorrect);
        boolean sevenIsCorrect = radioSevenCorrect.isChecked();
        if(sevenIsCorrect){
            playerScore += 10;
        }else {
            playerScore -= 10;
        }

        RadioButton radioEightCorrect = findViewById(R.id.eightCorrect);
        boolean eightIsCorrect = radioEightCorrect.isChecked();
        if(eightIsCorrect){
            playerScore += 10;
        }else {
            playerScore -= 10;
        }

        EditText numberNineText = findViewById(R.id.nineAnswer);
        int userAnswerNumberNine =Integer.parseInt(numberNineText.getText().toString());
        if (userAnswerNumberNine == 1){
            playerScore += 10;
            Toast.makeText(this, "Que 9 Passed", Toast.LENGTH_SHORT).show();
        }else{
            playerScore -= 10;
            Toast.makeText(this, "Que 9 Failed", Toast.LENGTH_SHORT).show();
        }

        EditText numberTenText = findViewById(R.id.tenAnswer);
        int userAnswerNumberTen =Integer.parseInt(numberTenText.getText().toString());
        if (userAnswerNumberTen == 1){
            playerScore += 20;
            Toast.makeText(this, "Que 10 Passed", Toast.LENGTH_SHORT).show();
        }else{
            playerScore -= 20;
            Toast.makeText(this, "Que 10 Failed", Toast.LENGTH_SHORT).show();
        }


        String totalScore = Integer.toString(playerScore);
        Toast.makeText(this, totalScore, Toast.LENGTH_SHORT).show();

    }



}

