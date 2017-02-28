package com.example.dacapo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eimear on 24/02/2017.
 */

public class Questions {
    //create lists for the different levels
    private List<Question> level1 = new ArrayList<>();
    private List<Question> level2 = new ArrayList<>();
    private List<Question> level3 = new ArrayList<>();
    public Questions() {
        Question l1q1 = new Question(0, "How many lines are there on a stave?", "3", "5", "7", "5", "Yes, there are 5 lines on the stave.", "There are 5 lines on the stave");
        Question l1q2 = new Question(1, "What note does a treble clef land on?", "A", "B", "G", "G", "Correct feedback", "Incorrect feedback");
        Question l1q3 = new Question(2, "What note does a bass clef land on?", "A", "F", "G", "F", "Correct feedback", "Incorrect feedback");
        Question l1q4 = new Question(3, "Question (A)", "A", "B", "C", "A", "Correct feeedback", "Incorrect feedback");
        Question l1q5 = new Question(4, "Question (B)", "A", "B", "C", "B", "Correct feeedback", "Incorrect feedback");
        level1.add(l1q1);
        level1.add(l1q2);
        level1.add(l1q3);
        level1.add(l1q4);
        level1.add(l1q5);

        Question l2q1 = new Question(0, "How many beats does a minum last?", "1", "2", "4", "2", "Correct feeedback", "Incorrect feedback");
        Question l2q2 = new Question(1, "How many beats does a crochet last?", "1", "2", "4", "1", "Correct feedback", "Incorrect feedback");
        Question l2q3 = new Question(2, "How many beats does a semibreve last?", "1", "2", "4", "4", "Correct feedback", "Incorrect feedback");
        level2.add(l2q1);
        level2.add(l2q2);
        level2.add(l2q3);

        Question l3q1 = new Question(0, "Question (A)", "A", "B", "C", "A", "Correct feeedback", "Incorrect feedback");
        Question l3q2 = new Question(1, "Question (B)", "A", "B", "C", "B", "Correct feedback", "Incorrect feedback");
        Question l3q3 = new Question(2, "Question (C)", "A", "B", "C", "C", "Correct feedback", "Incorrect feedback");
        level3.add(l3q1);
        level3.add(l3q2);
        level3.add(l3q3);
    }
    public List<Question> getQuestions(int level) {
        if(level == 1) {
            return new ArrayList<>(level1);
        }
        if(level == 2) {
            return new ArrayList<>(level2);
        }
        if(level == 3) {
            return new ArrayList<>(level3);
        }
        return null;
    }
}
