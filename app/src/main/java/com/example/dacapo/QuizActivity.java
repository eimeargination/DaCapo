package com.example.dacapo;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
public class QuizActivity extends AppCompatActivity {
    //variables for the level, list of questions for that level, total number of questions, and current question
    int level;
    Questions questions;
    List<Question> questionList;
    int totalQuestions;
    Question currentQuestion;

    //variables for the score and the current question id
    int score=0;
    int qid=0;

    //variables for the actual content on the activity
    TextView questionText;
    Button A, B, C;
    ProgressBar prg;

    //variable for the bundle (for importing the level)
    Bundle b;

    AlertDialog.Builder correct, incorrect;
    AlertDialog correctAlert, incorrectAlert;


    //on create method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set layout
        setContentView(R.layout.activity_quiz);
        final CharSequence[] items = {"A", "B", "C"};

        correct = new AlertDialog.Builder(this);
        incorrect = new AlertDialog.Builder(this);
        correct.setTitle("Correct!");
        correct.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                nextQuestion();
            }
        });
        incorrect.setTitle("Incorrect.");
        incorrect.setPositiveButton("Next Question", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                nextQuestion();
            }
        });

        //assign all the Buttons, TextView etc to variables
        questionText = (TextView) findViewById(R.id.textView1);
        A = (Button) findViewById(R.id.button1);
        B = (Button) findViewById(R.id.button2);
        C = (Button) findViewById(R.id.button3);

        prg = (ProgressBar) findViewById(R.id.progressBar);
        //create the questions
        questions = new Questions();
        //get the level from which button was pressed
        b = getIntent().getExtras();
        level = b.getInt("level");
        //get the question list for the level
        questionList = questions.getQuestions(level);
        //checks that the question list isn't null (it shouldn't ever be)
        if(questionList != null) {
            //set the total number of questions and the current question
            totalQuestions = questionList.size();
            currentQuestion = questionList.get(qid);
            //set question view
            setQuestionView();
        }
        else {
            //if questionList is null (which it shouldn't be), return to main menu
            Intent intent = new Intent(this, QuizEndActivity.class);
            startActivity(intent);
        }
    }

    //set question view method
    private void setQuestionView() {
        //set each item on the activity to the current question data
        questionText.setText(currentQuestion.getQuestion());
        A.setText(currentQuestion.getA());
        B.setText(currentQuestion.getB());
        C.setText(currentQuestion.getC());
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswerA(v);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswerB(v);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswerC(v);
            }
        });
        //set progress bar to the percentage through the questions
        prg.setProgress(qid*100/totalQuestions);
        //increase the qid
        qid++;
    }

    //check if answer A is correct
    public void checkAnswerA(View view){
        if(currentQuestion.getAnswer().equals(A.getText())) {
            //increase score if it is
            score++;
            correct.setMessage(currentQuestion.getFeedbackPositive());
            correctAlert = correct.create();
            correctAlert.show();
        }
        else {
            incorrect.setMessage(currentQuestion.getFeedbackNegative());
            incorrectAlert = incorrect.create();
            incorrectAlert.show();
        }
        setQuestionsUnanswerable();
    }
    //check if answer B is correct
    public void checkAnswerB(View view){
        if(currentQuestion.getAnswer().equals(B.getText())) {
            //increase score if it is
            score++;
            correct.setMessage(currentQuestion.getFeedbackPositive());
            correctAlert = correct.create();
            correctAlert.show();
        }
        else {
            incorrect.setMessage(currentQuestion.getFeedbackNegative());
            incorrectAlert = incorrect.create();
            incorrectAlert.show();
        }
        setQuestionsUnanswerable();
    }
    //check if answer C is correct
    public void checkAnswerC(View view){
        if(currentQuestion.getAnswer().equals(C.getText())) {
            //increase score if it is
            score++;
            correct.setMessage(currentQuestion.getFeedbackPositive());
            correctAlert = correct.create();
            correctAlert.show();
        }
        else {
            incorrect.setMessage(currentQuestion.getFeedbackNegative());
            incorrectAlert = incorrect.create();
            incorrectAlert.show();
        }
        setQuestionsUnanswerable();
    }

    private void setQuestionsUnanswerable() {
        View.OnClickListener unclickable = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextQuestion();
            }
        };
        A.setOnClickListener(unclickable);
        B.setOnClickListener(unclickable);
        C.setOnClickListener(unclickable);
    }

    public void nextQuestion(){
        //check whether qid is still less than the total number of questions
        if(qid < totalQuestions) {
            //change currentQuestion to the next question
            currentQuestion = questionList.get(qid);
            //set question view
            setQuestionView();
        }
        //if qid >= totalQuestions:
        else {
            //create an intent for the QuizEndActivity
            Intent intent = new Intent(this, QuizEndActivity.class);
            //create a bundle to store the score
            Bundle b = new Bundle();
            b.putInt("score", score);
            //add the bundle to the intent
            intent.putExtras(b);
            //start the next activity
            startActivity(intent);
        }
    }
}
