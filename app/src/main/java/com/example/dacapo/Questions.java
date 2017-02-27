package com.example.dacapo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eimea on 24/02/2017.
 */

public class Questions {
    //create lists for the different levels
    private List<Question> level1 = new ArrayList<Question>();
    private List<Question> level2 = new ArrayList<Question>();
    public Questions() {
        Question l1q1 = new Question(0, "How many lines are there on a stave?", "3", "5", "7", "5", "Yes, there are 5 lines on the stave.", "Incorrect.");
        Question l1q2 = new Question(1, "What note does a treble clef land on?", "A", "B", "G", "G", "Correct!", "Incorrect.");
        Question l1q3 = new Question(2, "What note does a bass clef land on?", "A", "F", "G", "F", "Correct!", "Incorrect.");
        level1.add(l1q1);
        level1.add(l1q2);
        level1.add(l1q3);

        Question l2q1 = new Question(0, "How many beats does a minum last?", "1", "2", "3", "2", "Correct!", "Incorrect.");
        Question l2q2 = new Question(1, "How many beats does a crochet last?", "1", "2", "3", "1", "Correct!", "Incorrect.");
        Question l2q3 = new Question(2, "How?", "A", "F", "G", "F", "Correct!", "Incorrect.");
        level2.add(l2q1);
        level2.add(l2q2);
        level2.add(l2q3);
    }
    public List<Question> getQuestions(int level) {
        if(level == 1) {
            return level1;
        }
        if(level == 2) {
            return level2;
        }
        return null;
    }
}
