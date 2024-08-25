package org.example.medium._25_8_2024;

public class Main {

    public static void main(String[] args) {

    }

    public static int goodNodes(TreeNode root) {
        return countNodes(root, root.val);
    }

    public static int countNodes(TreeNode root, int max) {
        if (root == null) return 0;
        int count = 0;
        if(root.val >= max) {
            max = root.val;
            count++;
        }
        return  count + countNodes(root.left, max) + countNodes(root.right, max);
    }

    public static class TreeNode {
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
/*
Count Good Nodes in Binary Tree
Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a
value greater than X.

Return the number of good nodes in the binary tree.

 Input: root = [3,1,4,3,null,1,5]
Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.
Input: root = [3,3,null,4,2]
Output: 3
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
Example 3:

Input: root = [1]
Output: 1
Explanation: Root is considered as good.
 */