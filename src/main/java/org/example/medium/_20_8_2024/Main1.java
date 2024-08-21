package org.example.medium._20_8_2024;

import org.example.medium._19_8_2024.Main;

public class Main1 {
    public static void main(String[] args) {

    }

    public static Main.ListNode oddEvenList(org.example.medium._19_8_2024.Main.ListNode head) {
        Main.ListNode copy  = head;
        Main.ListNode odd =  new Main.ListNode();
        Main.ListNode oddHead =  odd;
        Main.ListNode even =  new Main.ListNode();
        Main.ListNode evenHead = even;
        int count = 1;
        while (copy != null) {
            if(count % 2 == 0) {
                even.next = copy;
                even = even.next;
            } else {
                odd.next = copy;
                odd = odd.next;
            }

            copy = copy.next;
            count++;
        }
        even.next = null;
        oddHead = oddHead.next;
        odd.next = evenHead.next;
        return oddHead;
    }
}

/*
328. Odd Even Linked List
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even
 indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 */