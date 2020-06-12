package com.prep.interviews.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MettleTest2Test {
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


    @Test
    public void leftRotateArray_withArray_returnsArray() {
        //Setup
        MettleTest2 rotate = new MettleTest2();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        arr = rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
        //Exercise

        //Assert
        //assertEquals(expected, actual);
        //Teardown
    }

}