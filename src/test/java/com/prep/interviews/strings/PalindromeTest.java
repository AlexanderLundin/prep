package com.prep.interviews.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void count_withMany_returnsInt() {
        //Setup
        String inputString = "tacocat";
        //Exercise
        Integer expected = 10;
        Integer actual = Palindrome.count(inputString);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}