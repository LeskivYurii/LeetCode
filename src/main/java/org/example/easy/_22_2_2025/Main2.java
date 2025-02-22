package org.example.easy._22_2_2025;

public class Main2 {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        if(head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        while (current.next != null) {
            if(current.next.val == val) {
                ListNode temp = current.next;
                while (temp != null && temp.val == val) {
                    temp = temp.next;
                }
                current.next = temp;
            }
            current = current.next;
        }

        return head;
    }

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
