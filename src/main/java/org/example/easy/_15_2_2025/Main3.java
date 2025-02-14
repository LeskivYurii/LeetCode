package org.example.easy._15_2_2025;

public class Main3 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode current = head;
        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next.next;
            if (fast == current ) {
                return true;
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
