package com.example.root.a201higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editguess;

    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editguess = findViewById(R.id.editguess);

        Random random = new Random();
        n = random.nextInt(20) + 1;
    }

    public void guessButton(View view) {
        int guessedNumber = Integer.parseInt(editguess.getText().toString());
        if(guessedNumber > 20){
            makeToast("GUESS A NUMBER BETWEEN 1 AND 20!");
        }else{
            if(guessedNumber > n){
                makeToast("Guess a lower");
            }else if(guessedNumber < n){
                makeToast("Guess a higher");
            }else{
                makeToast("You guessed right! PLAY AGAIN");
                Random rand = new Random();
                n = rand.nextInt(20) + 1;
            }
        }

    }

    public void makeToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
