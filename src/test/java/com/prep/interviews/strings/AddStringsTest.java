package com.prep.interviews.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest {
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

    // facebook tech screen

    AddStrings testClass = new AddStrings();
    @Test
    public void addStrings_returnsString() {
        //Setup
        String num1 = "123";
        String num2 = "8";
        //Exercise
        String expected = "131";
        String actual = testClass.addStrings(num1, num2);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }

}