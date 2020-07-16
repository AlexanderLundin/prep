package com.prep.interviews.pair;

import javafx.util.Pair;

import java.util.ArrayList;

public class DisplayAllPairs {

    /* This method returns a Pair which hasmaximum score*/
    public static void
    printChars(Pair <Character,Character> p)
    {

        char key = p.getKey();
        char value = p.getValue();

        int min = (int)key;
        int max = (int)value;

        for (int i = min; i <= max; i++) {
            System.out.println((char) i);

        }
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int n = 5;//Number of Students

        //Create an Array List
        ArrayList <Pair <Character,Character> > l =
                new ArrayList <Pair <Character,Character> > ();

        /*  Create pair of name of student  with their
            corresponding score and insert into the
            Arraylist */
        Pair p = new Pair <Character,Character> ('a', 'd');
        l.add(p);

        printChars(p);

    }
}
