package org.example.easy._7_2_2025;

public class Main3 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        return deleteDuplicates(head, head.next, head);
    }

    public ListNode deleteDuplicates(ListNode previous, ListNode current, ListNode head) {
        if(current == null) return head;
        if(previous.val == current.val) {
            previous.next = current.next;
            return deleteDuplicates(previous, current.next, head);
        }

        return deleteDuplicates(current, current.next, head);
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
}
