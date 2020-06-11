package com.prep.leetcode.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringNoRepeatsTest {

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
    String input;
    int expected;
    int actual;


    @Test
    public void lengthOfLongestSubstring_returnsThree() {
        //Setup
        input = "abcabcbb";
        expected = 3;
        //Exercise
        actual = LongestSubstringNoRepeats.lengthOfLongestSubstring(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void lengthOfLongestSubstring_returnsOne() {
        //Setup
        input = "bbbbb";
        expected = 1;
        //Exercise
        actual = LongestSubstringNoRepeats.lengthOfLongestSubstring(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void lengthOfLongestSubstring_pwwkew_returnsThree() {
        //Setup
        input = "pwwkew";
        expected = 3;
        //Exercise
        actual = LongestSubstringNoRepeats.lengthOfLongestSubstring(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}