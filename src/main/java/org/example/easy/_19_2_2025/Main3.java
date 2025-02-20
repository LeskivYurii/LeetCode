package org.example.easy._19_2_2025;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode leftPointer = headA;
        ListNode rightPointer = headB;
        Set<ListNode> listNode = new HashSet<>();
        while (leftPointer != null) {
            listNode.add(leftPointer);
            leftPointer = leftPointer.next;
        }
        while (rightPointer != null) {
            if (!listNode.add(rightPointer)) {
                return rightPointer;
            }
            rightPointer = rightPointer.next;

        }

        return null;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
