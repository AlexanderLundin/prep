package com.prep.hackerrank.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalArraysTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  print the largest sum of the numbers in any given hourglass
    //Input
    //  6 X 6 2D array
    //Constraints
    //  Are there any stated constraints to the problem?
    //      No
    //  Are there any indicators of time vs space trade-offs?
    //      No
    //Examples and Edge Cases
    //  List examples from problem
    //
    // Sample Input
    //  1 1 1 0 0 0
    //  0 1 0 0 0 0
    //  1 1 1 0 0 0
    //  0 0 2 4 4 0
    //  0 0 0 2 0 0
    //  0 0 1 2 4 0
    //
    // Sample Output
    //
    //  19
    //  Think of edge cases at boundary values, 0 and 1 are typical

    int [][] array;

    @Test
    public void sumOfLargestHourGlass_returnsInt() {
        //Setup
        array = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int expected = 19;
        //Exercise
        int actual = TwoDimensionalArrays.sumOfLargestHourGlass(array);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void sumOfLargestHourGlass__largestOnEdge_returnsInt() {
        //Setup
        array = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 2, 4, 4},
                {0, 0, 0, 0, 2, 0},
                {0, 0, 0, 1, 2, 4}
        };
        int expected = 19;
        //Exercise
        int actual = TwoDimensionalArrays.sumOfLargestHourGlass(array);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}