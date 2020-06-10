package com.prep.hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneDimensionalArraysTests {

    //OICE - An effective way to consume requirements
    //Output
    //  integer values printed from array
    //Input
    //  integer value from stdin
    //Constraints
    //  Are there any stated constraints to the problem?
    //      No
    //  Are there any indicators of time vs space trade-offs?
    //      No
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical

    @Test
    public void createArray_returnsArray() {
        //Setup
        int expected = 5;
        //Exercise
        OneDimensionalArray array = new OneDimensionalArray(expected);
        //Assert
        assertEquals(expected, array.getSize());
        //Teardown
    }
}
