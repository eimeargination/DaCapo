package com.example.dacapo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToQuiz1(View view){
        Bundle b = new Bundle();
        b.putInt("level", 1);
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
    public void GoToQuiz2(View view){
        Bundle b = new Bundle();
        b.putInt("level", 2);
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
}
