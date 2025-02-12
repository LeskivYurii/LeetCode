package org.example.easy._13_2_2025;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return findHeight(root) != -1;
    }


    public int findHeight(TreeNode root) {
        if(root == null) return  0;
        int leftHeight =findHeight(root.left);
        int rightHeight =findHeight(root.right);
        if(leftHeight == -1) return -1;
        if(rightHeight == -1) return -1;
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }


        public static class TreeNode {
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
