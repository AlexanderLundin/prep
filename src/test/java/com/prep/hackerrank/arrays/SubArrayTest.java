package com.prep.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  print count of negative sub arrays
    //Input
    //  array of n integers
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical

    @Test
    public void countNegativeSubArrays_returnsInteger() {
        //Setup
        int expected = 9;
        int [] array = {1, -2 ,4, -5, 1};
        //Exercise
        int actual = SubArray.countNegativeSubArrays(array);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}