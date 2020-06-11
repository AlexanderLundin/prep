package com.prep.leetcode.medium.linkedlist;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String accumulator1 = "";
        int value;
        ListNode current = l1;
        while(current != null){
            value = current.val;
            accumulator1 = value + accumulator1;
            current = current.next;
        }
        String accumulator2 = "";
        current = l2;
        while(current != null){
            value = current.val;
            accumulator2 = value + accumulator2;
            current = current.next;
        }
        int value1 = Integer.parseInt(accumulator1);
        int value2 = Integer.parseInt(accumulator2);
        int result = value1 + value2;
        String resultString = "" + result;
        String reverse = "";
        String character = "";
        ListNode currentNode;
        ListNode previousNode = null;
        for (int i = 0; i < resultString.length(); i++) {
            character = resultString.substring(i, i+1);
            if (previousNode != null){
                currentNode = new ListNode(Integer.parseInt(character), previousNode);
            }else{
                currentNode = new ListNode(Integer.parseInt(character));
            }
            reverse = character + reverse;
            previousNode = currentNode;
        }
        return previousNode;
    }

    public static class ListNode {
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
}
