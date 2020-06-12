package com.prep.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
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
    //  Given array nums = [-1, 0, 1, 2, -1, -4],
    //  A solution set is:
    //        [
    //        [-1, 0, 1],
    //        [-1, -1, 2]
    //        ]
    int[] input;
    List<List<Integer>> expected;
    List<List<Integer>> actual;
    ThreeSum testClass = new ThreeSum();

    @Test
    public void threeSum_withArray_returnsListofLists() {
        //Setup
        input = new int[]{-1, 0, 1, 2, -1, -4};
        int [] solution1 = new int[]{-1,0,1};
        int [] solution2 = new int[]{-1,-1,2};
//        List l1 = Arrays.asList(solution1);
//        List l2 = Arrays.asList(solution2);
//        expected.add(l1);
//        expected.add(l2);
        //Exercise
        actual = testClass.threeSum(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}