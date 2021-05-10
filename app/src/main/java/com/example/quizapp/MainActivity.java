package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private String[] questions={"Java is a person?","Java was intrduced in 1233?","Java was created using python?","Java has abstract classes?","Java supports interface?"};
    private boolean[] answers={false,false,false,true,true};
    private int score=0;
    Button yes;
    Button no;
    TextView question;
    private int index=0;
    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.button5);
        no=findViewById(R.id.button6);
        question=findViewById(R.id.textView3);
        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
//                if the array i snot going out of bounds
                if(index<=questions.length-1){
//                    if your answer is correct
                    if(answers[index]==true){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
//                if the array i snot going out of bounds
                if(index<=questions.length-1){
//                    if your answer is correct
                    if(answers[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}