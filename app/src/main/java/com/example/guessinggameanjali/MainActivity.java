package com.example.guessinggameanjali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generate(){

        Random rand = new Random();

        randomNumber = rand.nextInt(100) + 1;
    }

    public void Guess(View view){

        Log.i("info",Integer.toString(randomNumber));

        EditText numEditText = (EditText)findViewById(R.id.numEditText);
        int guessValue = Integer.parseInt(numEditText.getText().toString());

        String message;

        if (guessValue>randomNumber){

            message = "lower";
        }
        else if(guessValue< randomNumber){

            message = "higher";
        }
        else{

            message ="You got it!! Try again!!";

            generate();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("random number", Integer.toString(randomNumber));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate();

    }
}
