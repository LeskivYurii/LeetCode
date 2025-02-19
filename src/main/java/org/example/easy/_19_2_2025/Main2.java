package org.example.easy._19_2_2025;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void traverse(TreeNode treeNode, List<Integer> list) {
        if(treeNode == null) return;
        if(treeNode.left != null) {
            traverse(treeNode.left, list);
        }
        if(treeNode.right != null) {
            traverse(treeNode.right, list);
        }
        list.add(treeNode.val);
    }

          public class TreeNode {
              int val;
              TreeNode left;
              TreeNode right;

              TreeNode() {
              }

              TreeNode(int val) {
                  this.val = val;
              }

              TreeNode(int val, TreeNode left, TreeNode right) {
                  this.val = val;
                  this.left = left;
                  this.right = right;
              }
          }
}
