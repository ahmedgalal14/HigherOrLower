package com.example.ahmedgalal.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;

    public void guessFunction (View view){

        EditText guess = (EditText) findViewById(R.id.guesssField);
        String guessnumberstring = guess.getText().toString();
        int guessnemberint = Integer.parseInt(guessnumberstring);
        String Message;

        if (guessnemberint > randomnumber){
            Message = "Too High";
        }
        else if (guessnemberint < randomnumber) {
            Message = "Too Low";
        }
        else {
            Message = "Correct, You did it :D ";
        }

        Toast.makeText(getApplicationContext(), Message , Toast.LENGTH_LONG).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomnumber = random.nextInt(21);
    }
}
