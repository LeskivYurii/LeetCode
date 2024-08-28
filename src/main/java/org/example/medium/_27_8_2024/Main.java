package org.example.medium._27_8_2024;

public class Main {
    public static void main(String[] args) {

    }

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        return Math.max(rec(root.left, 0, false), rec(root.right, 0, true));
    }

    public int rec(TreeNode root, int count, boolean isTurnLeft) {
        int max = count;
        if (root == null) return count;
        if(isTurnLeft) {
            max = Math.max(rec(root.left, count+1, false), max);
            max = Math.max(rec(root.right, 0, true), max);
        } else  {
            max = Math.max(rec(root.left, 0, false), max);
            max = Math.max(rec(root.right, count+1, true), max);
        }
        return max;
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
Longest ZigZag Path in a Binary Tree
You are given the root of a binary tree.

A ZigZag path for a binary tree is defined as follow:

Choose any node in the binary tree and a direction (right or left).
If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
Change the direction from right to left or from left to right.
Repeat the second and third steps until you can't move in the tree.
Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

Return the longest ZigZag path contained in that tree.
Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
Output: 3
Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
 */