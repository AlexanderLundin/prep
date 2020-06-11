package com.prep.leetcode.medium.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
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
    AddTwoNumbers.ListNode l1;
    AddTwoNumbers.ListNode l2;
    AddTwoNumbers.ListNode l3;
    AddTwoNumbers.ListNode l4;
    AddTwoNumbers.ListNode l5;
    AddTwoNumbers.ListNode l6;
    AddTwoNumbers.ListNode expected;
    AddTwoNumbers.ListNode actual;

    @Test
    public void addTwoNumbers_returns807() {
        //Setup
        l3 = new AddTwoNumbers.ListNode(2);
        l2 = new AddTwoNumbers.ListNode(4, l3);
        l1 = new AddTwoNumbers.ListNode(3, l2);
        l6 = new AddTwoNumbers.ListNode(5);
        l5 = new AddTwoNumbers.ListNode(6, l6);
        l4 = new AddTwoNumbers.ListNode(4, l5);
        expected = new AddTwoNumbers.ListNode(807);
        //Exercise
        actual = AddTwoNumbers.addTwoNumbers(l1,l4);
        //Assert
        assertEquals(expected.val, actual.val);
        //Teardown
    }
}