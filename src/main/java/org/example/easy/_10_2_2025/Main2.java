package org.example.easy._10_2_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public void traverse(TreeNode treeNode, List<Integer> list) {
        if(treeNode == null) return;
        traverse(treeNode.left, list);
        list.add(treeNode.val);
        traverse(treeNode.right, list);


    }

      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
