package org.example.easy._26_2_2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {

    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String>  list = new ArrayList<>();
        if(root.left == null && root.right == null) {
            list.add(root.val + "");
        }
        list.addAll(binaryTreePaths(root.val + "", root.left));
        list.addAll(binaryTreePaths(root.val + "", root.right));
        return list;
    }

    public Set<String> binaryTreePaths(String format, TreeNode root) {
        if (root == null) {
            return Set.of();
        }
        Set<String> list = new HashSet<>();
        format += "->" + root.val;
        if(root.left == null && root.right == null) {
            list.add(format);
        }
        list.addAll(binaryTreePaths(format, root.left));
        list.addAll(binaryTreePaths(format, root.right));
        return list;
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
