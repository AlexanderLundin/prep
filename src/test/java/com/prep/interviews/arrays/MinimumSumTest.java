package com.prep.interviews.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSumTest {

    @Test
    public void minSum_returnsSum() {
        //Setup
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(7);
        //Exercise
        int expected = 14;
        int actual = MinimumSum.minSum(ints, 4);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}