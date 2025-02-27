package org.example.easy._26_2_2025;

import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack();
        ListNode currentNode = head;
        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.next;
        }

        currentNode = head;
        while (currentNode != null) {
            if(stack.pop().val != currentNode.val) return false;
            currentNode = currentNode.next;
        }
        return true;
    }

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
