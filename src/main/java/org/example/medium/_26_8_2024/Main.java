package org.example.medium._26_8_2024;

public class Main {
    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return pathSumRecurs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int pathSumRecurs(TreeNode root, long targetSum) {

        if (root == null) {
            return 0;
        }
        return (root.val == targetSum ? 1 : 0) + pathSumRecurs(root.left, targetSum - root.val)  + pathSumRecurs(root.right, targetSum - root.val);
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
Path Sum III
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values
 along the path equals targetSum.
The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from
 parent nodes to child nodes).
 Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
Output: 3
Explanation: The paths that sum to 8 are shown.
Example 2:

Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: 3
 */
