package com.prep.leetcode.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  String
    //Input
    //  String
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical
    //Example 1:
    //Input: "babad"
    //Output: "bab"
    //Note: "aba" is also a valid answer.
    //Example 2:
    //Input: "cbbd"
    //Output: "bb"
    String input;
    String expected;
    String actual;
    LongestPalindrome testClass = new LongestPalindrome();

    @Test
    public void longestPalindrome_with_babad_returns_bab() {
        //Setup
        input = "babad";
        expected = "bab";
        //Exercise
        actual = testClass.longestPalindrome(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void longestPalindrome_with_cbbd_returns_bb() {
        //Setup
        input = "cbbd";
        expected = "bb";
        //Exercise
        actual = testClass.longestPalindrome(input);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}