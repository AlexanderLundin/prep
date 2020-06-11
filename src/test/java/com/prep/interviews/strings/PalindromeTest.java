package com.prep.interviews.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void count_withPalindrome1_returnsInt() {
        //Setup
        String inputString = "tacocat";
        //Exercise
        Integer expected = 10;
        Integer actual = Palindrome.count(inputString);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

    @Test
    public void count_withPalindrome2_returnsInt() {
        //Setup
        String inputString = "this_is_a_palindrome_emordnilap_a_si_siht";
        //Exercise
        Integer expected = 63;
        Integer actual = Palindrome.count(inputString);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }


}