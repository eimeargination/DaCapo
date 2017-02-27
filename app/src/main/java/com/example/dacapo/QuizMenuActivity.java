package com.example.dacapo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_menu);
    }

    public void goToQuiz1(View view){
        Bundle b = new Bundle();
        b.putInt("level", 1);
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
    public void goToQuiz2(View view){
        Bundle b = new Bundle();
        b.putInt("level", 2);
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
    public void goToQuiz3(View view){
        Bundle b = new Bundle();
        b.putInt("level", 3);
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
}
