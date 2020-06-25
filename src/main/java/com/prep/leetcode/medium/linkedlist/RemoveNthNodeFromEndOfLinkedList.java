package com.prep.leetcode.medium.linkedlist;

import java.util.List;

public class RemoveNthNodeFromEndOfLinkedList {
    public ListNode createLinkedList (int[] values){
        int value = values[0];
        ListNode head = new ListNode(value);
        ListNode next;
        ListNode previous = head;
        for (int i = 1; i < values.length; i++) {
            value = values[i];
            next = new ListNode(value);
            previous.next = next;
            previous = next;
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
