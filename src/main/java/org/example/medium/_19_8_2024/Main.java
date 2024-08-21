package org.example.medium._19_8_2024;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(3,listNode);
        ListNode listNode2 = new ListNode(2,listNode1);
        ListNode listNode3 = new ListNode(1,listNode2);

        System.out.println(deleteMiddle(listNode3));
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode copy = head;
        int count = 1;
        while (copy.next != null) {
            count++;
            copy = copy.next;
        }

        if(count == 1){
            return null;
        }

        copy = head;
        for(int i = 1; i < count / 2; i++) {
            copy = copy.next;
        }
        System.out.println(copy.val);
        if(copy.next != null) {
            copy.next = copy.next.next;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                   "val=" + val +
                   ", next=" + next +
                   '}';
        }
    }
}

/*
Delete the Middle Node of a Linked List
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */
