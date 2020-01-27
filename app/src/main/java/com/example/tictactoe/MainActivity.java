package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private TextView first,second,third,fourth,fifth,sixth,seventh,eighth, ninth;

    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        onClicks();

    }

    private void init() {

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third= findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seventh = findViewById(R.id.seventh);
        eighth = findViewById(R.id.eighth);
        ninth = findViewById(R.id.ninth);

    }

    private void onClicks() {
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,first);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,second);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,third);
            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,fourth);
            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,fifth);
            }
        });
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,sixth);
            }
        });
        seventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,seventh);
            }
        });
        eighth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,eighth);
            }
        });
        ninth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTextViewClicked(count,ninth);
            }
        });

    }

    private void onTextViewClicked(int count,TextView textView ){
        Log.d("TAG"," : "+count);
        if (count%2==1){
            textView.setText("X");
        }
        else if (count%2==0) {
            textView.setText("O");
        }
        textView.setClickable(false);
        checkDigonalConditions();
        checkHorizontleConditions();
        checkVerticleConditions();
        this.count++;
    }

    private void checkDigonalConditions(){
        if (first.getText() =="X" && fifth.getText() == "X" && ninth.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        if (third.getText() =="X" && fifth.getText() == "X" && seventh.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        if (first.getText() =="O" && fifth.getText() == "O" && ninth.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
        if (third.getText() =="O" && fifth.getText() == "O" && seventh.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
    }
    private void checkHorizontleConditions(){
        if (first.getText() =="X" && second.getText() == "X" && third.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (fourth.getText() =="X" && fifth.getText() == "X" && sixth.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (second.getText() =="X" && eighth.getText() == "X" && ninth.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (first.getText() =="O" && second.getText() == "O" && third.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
        else if (fourth.getText() =="O" && fifth.getText() == "O" && sixth.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
        else if (second.getText() =="O" && eighth.getText() == "O" && ninth.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
    }
    private void checkVerticleConditions(){
        if (first.getText() =="X" && fourth.getText() == "X" && seventh.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (second.getText() =="X" && fifth.getText() == "X" && eighth.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (third.getText() =="X" && sixth.getText() == "X" && ninth.getText() == "X"){
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT).show();
        }
        else if (first.getText() =="O" && fourth.getText() == "O" && seventh.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
        else if (second.getText() =="O" && fifth.getText() == "O" && eighth.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
        else if (third.getText() =="O" && sixth.getText() == "O" && ninth.getText() == "O"){
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT).show();
        }
    }
}