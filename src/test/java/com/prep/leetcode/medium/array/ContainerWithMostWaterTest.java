package com.prep.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  Make sure to write Output down
    //Input
    //  Make sure to write Input down
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical
    //  Input:
    //  Output: 49
    int[] input;
    int expected;
    int actual;
    ContainerWithMostWater testClass = new ContainerWithMostWater();
    @Test
    public void maxArea_withInput_returns49() {
        //Setup
        input = new int[]{1,8,6,2,5,4,8,3,7};
        expected = 49;
        //Exercise
        actual = testClass.maxArea(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}