package com.prep.leetcode.medium.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfLinkedListTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  Node - head
    //Input
    //  Integer - n
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical
    //Given linked list: 1->2->3->4->5, and n = 2.
    //
    //After removing the second node from the end, the linked list becomes 1->2->3->5.

    @Test
    public void removeNthFromEnd_withLinkedList_returnsNewHead() {
        //Setup
        RemoveNthNodeFromEndOfLinkedList testClass = new RemoveNthNodeFromEndOfLinkedList();
        int[] values = new int[]{1,2,3,4,5};
        RemoveNthNodeFromEndOfLinkedList.ListNode expected = testClass.createLinkedList(values);
        int[] values2 = new int[]{1,2,3,5};
        RemoveNthNodeFromEndOfLinkedList.ListNode actual = testClass.removeNthFromEnd(expected,4);
        //Exercise

        //Assert
        assertEquals(expected.val, actual.val);
        //Teardown
    }

    @Test
    public void removeNthFromEnd_withLinkedList_returnsNewHead_2() {
        //Setup
        RemoveNthNodeFromEndOfLinkedList testClass = new RemoveNthNodeFromEndOfLinkedList();
        int[] values = new int[]{1,2,3,4,5};
        RemoveNthNodeFromEndOfLinkedList.ListNode expected = testClass.createLinkedList(values);
        int[] values2 = new int[]{1,2,3,5};
        RemoveNthNodeFromEndOfLinkedList.ListNode actual = testClass.removeNthFromEnd(expected,5);
        //Exercise

        //Assert
        assertEquals(2, actual.val);
        //Teardown
    }
}