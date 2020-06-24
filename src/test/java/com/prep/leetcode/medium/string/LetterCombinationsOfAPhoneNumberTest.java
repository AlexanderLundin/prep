package com.prep.leetcode.medium.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  Array of strings
    //Input
    //  String
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //Example:
    //
    //Input: "23"
    //Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    LetterCombinationsOfAPhoneNumber testClass = new LetterCombinationsOfAPhoneNumber();
    @Test
    public void letterCombinations_23_returnsArray() {
        //Setup
        String input = "23";
        //Exercise
        List<String> actual = testClass.letterCombinations(input);
        //Assert
        assertEquals(9, actual.size());
        //Teardown
    }
}