package com.example.dacapo;

/**
 * Created by eimea on 10/02/2017.
 */

public class Question {


    private int id;
    private String question;
    private int imageSource;
    private int numberOfOptions;
    private String A;
    private String B;
    private String C;
    private String answer;
    private String feedbackPositive;
    private String feedbackNegative;
    private boolean correct;

    public Question(int id, String question, int imageSource, String A, String B, String answer, String feedbackPositive, String feedbackNegative){
        this.id = id;
        this.question = question;
        this.imageSource = imageSource;
        numberOfOptions = 2;
        this.A = A;
        this.B = B;
        this.C = null;
        this.answer = answer;
        this.feedbackPositive = feedbackPositive;
        this.feedbackNegative = feedbackNegative;
        correct = false;
    }
    public Question(int id, String question, int imageSource, String A, String B, String C, String answer, String feedbackPositive, String feedbackNegative){
        this.id = id;
        this.question = question;
        this.imageSource = imageSource;
        numberOfOptions = 3;
        this.A = A;
        this.B = B;
        this.C = C;
        this.answer = answer;
        this.feedbackPositive = feedbackPositive;
        this.feedbackNegative = feedbackNegative;
        correct = false;
    }
    public Question(int id, String question, String A, String B, String answer, String feedbackPositive, String feedbackNegative){
        this.id = id;
        this.question = question;
        imageSource = 0;
        numberOfOptions = 2;
        this.A = A;
        this.B = B;
        this.C = null;
        this.answer = answer;
        this.feedbackPositive = feedbackPositive;
        this.feedbackNegative = feedbackNegative;
        correct = false;
    }
    public Question(int id, String question, String A, String B, String C, String answer, String feedbackPositive, String feedbackNegative){
        this.id = id;
        this.question = question;
        imageSource = 0;
        numberOfOptions = 3;
        this.A = A;
        this.B = B;
        this.C = C;
        this.answer = answer;
        this.feedbackPositive = feedbackPositive;
        this.feedbackNegative = feedbackNegative;
        correct = false;
    }

    public int getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }
    public int getImageSource() {
        return imageSource;
    }
    public int getNumberOfOptions() {
        return numberOfOptions;
    }
    public String getA() {
        return A;
    }
    public String getB() {
        return B;
    }
    public String getC() {
        return C;
    }
    public String getAnswer() {
        return answer;
    }
    public String getFeedbackPositive() {
        return feedbackPositive;
    }
    public String getFeedbackNegative() {
        return feedbackNegative;
    }
    public boolean getCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
