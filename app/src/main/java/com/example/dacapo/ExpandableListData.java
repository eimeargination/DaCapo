package com.example.dacapo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by eimea on 28/02/2017.
 */

public class ExpandableListData {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListData = new HashMap<String, List<String>>();

        List<String> grade1 = new ArrayList<String>();
        grade1.add("Quiz 1");
        grade1.add("Quiz 2");
        grade1.add("Quiz 3");
        grade1.add("Quiz 4");
        grade1.add("Quiz 5");

        List<String> grade2 = new ArrayList<String>();
        grade2.add("Quiz 1");
        grade2.add("Quiz 2");
        grade2.add("Quiz 3");
        grade2.add("Quiz 4");
        grade2.add("Quiz 5");

        List<String> grade3 = new ArrayList<String>();
        grade3.add("Quiz 1");
        grade3.add("Quiz 2");
        grade3.add("Quiz 3");
        grade3.add("Quiz 4");
        grade3.add("Quiz 5");

        expandableListData.put("GRADE 1", grade1);
        expandableListData.put("GRADE 2", grade2);
        expandableListData.put("GRADE 3", grade3);
        return expandableListData;
    }
}

