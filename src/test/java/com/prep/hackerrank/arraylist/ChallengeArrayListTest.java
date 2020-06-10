package com.prep.hackerrank.arraylist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ChallengeArrayListTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  integer located at yth position of xth line
    //  or print "ERROR!"
    //Input
    //  n lines of input
    //  on each line d, the first number will be d, denoting the number of ints on line
    //  ints are space separated
    //  next line is query q, which consists of two integers x and y
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical
    //Integer array0[] = {2};
    //Integer array1[] = {5, 41, 77, 74, 22, 44};
    //Integer array2[] = {1, 12};
    //Integer array3[] = {4, 37, 34, 36, 52};
    //Integer array4[] = {0};
    //Integer array5[] = {3, 20, 22, 33};
    //List<Integer> myList1 = Arrays.asList(array1);
    //List<Integer> myList2 = Arrays.asList(array2);
    //List<Integer> myList3 = Arrays.asList(array3);
    //List<Integer> myList4 = Arrays.asList(array4);
    //List<Integer> myList5 = Arrays.asList(array5);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    Integer[] array0 = {5};
    Integer[] array1 = {5, 41, 77, 74, 22, 44};
    Integer[] array2 = {1, 12};
    Integer[] array3 = {4, 37, 34, 36, 52};
    Integer[] array4 = new Integer[]{0};
    Integer[] array5 = {3, 20, 22, 33};
    Integer[][] twoDimensionalInts = {array0, array1, array2, array3, array4, array5};

    int[] arrayInts = {5, 5, 41, 77, 74, 22, 44, 1, 12, 4, 37, 34, 36, 52, 0, 3, 20, 22, 33};
    ArrayList arrayListInts = new ArrayList<Integer>(arrayInts.length);

    Integer[] array6 = {5};
    Integer[] array7 = {1, 3};
    Integer[] array8 = {3, 4};
    Integer[] array9 = {3, 1};
    Integer[] array10 = {4, 3};
    Integer[] array11 = {5, 5};
    Integer[][] twoDimensionalQueries = {array6, array7, array8, array9, array10, array11};

    int[] arrayQueries = {5, 1, 3, 3, 4, 3, 1, 4, 3, 5, 5};
    ArrayList arrayListQueries = new ArrayList<Integer>(arrayQueries.length);

    @BeforeAll
    public void setup() {
        //Setup
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        for (int i : arrayInts)
        {
            arrayListInts.add(i);
        }
        for (int q : arrayQueries)
        {
            arrayListQueries.add(q);
        }
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void toIntArrays_returnsArrays() {
        //Setup
        //Exercise
        Integer[][] actual = ChallengeArrayList.toIntArrays(arrayListInts);
        //Assert
        assertArrayEquals(twoDimensionalInts, actual);
        //Teardown
    }

    @Test
    public void toQueryArrays_withQueries_returnsArrays() {
        //Setup
        //Exercise
        Integer[][] actual = ChallengeArrayList.toQueryArrays(arrayListQueries);
        //Assert
        assertArrayEquals(twoDimensionalQueries, actual);
        //Teardown
    }

    @Test
    public void printValueAtXY_printsInt() {
        //Setup
        String expected = "74";
        Integer array0[] = {2};
        Integer array1[] = {5, 41, 77, 74, 22, 44};
        Integer array2[] = {1, 12};
        Integer arrays[][] = {array0, array1, array2};
        //Exercise
        ChallengeArrayList.printValueAtXY(arrays, 1, 3);
        //Assert
        assertThat(outContent.toString(), containsString(expected));
        //Teardown
    }

    @Test
    public void printValueAtXY_printsError() {
        //Setup
        String expected = "ERROR!";
        Integer[] array0 = {2};
        Integer[] array1 = {5};
        Integer[] array2 = {1};
        Integer[][] arrays = {array0, array1, array2};
        //Exercise
        ChallengeArrayList.printValueAtXY(arrays, 1, 3);
        //Assert
        assertThat(outContent.toString(), containsString(expected));
        //Teardown
    }



    @Test
    public void printValueAtXY_withArrays_printsValue() {
        //Setup
        String expected = "74";
        //Exercise
        ChallengeArrayList.printValueAtXY(twoDimensionalInts, 1, 3);
        //Assert
        assertThat(outContent.toString(), containsString(expected));
        //Teardown
    }

    @Test
    public void printValueAtXY_withArrays_printsError() {
        //Setup
        String expected = "ERROR!";
        //Exercise
        ChallengeArrayList.printValueAtXY(twoDimensionalInts, 1, 7);
        //Assert
        assertThat(outContent.toString(), containsString(expected));
        //Teardown
    }



}