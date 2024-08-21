package org.example.easy._21_8_2024;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode head4 = new ListNode(5);
        ListNode head3 = new ListNode(4, head4);
        ListNode head2 = new ListNode(3, head3);
        ListNode head1 = new ListNode(2, head2);
        ListNode head = new ListNode(1, head1);
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
     ListNode copy = head;
     ListNode reversed = new ListNode();
     ListNode reversedHead = reversed;
     List<ListNode> list = new ArrayList<>();
     while (copy != null) {
         list.add(copy);
         copy = copy.next;
     }

     for (int i = list.size() - 1; i >= 0; i--) {
         reversed.next = list.get(i);
         reversed = reversed.next;
         reversed.next = null;
     }

     return reversedHead.next;
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
            return "" + val + " " + next;
        }
    }
}

/*
Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Input: head = [1,2]
Output: [2,1]
 */