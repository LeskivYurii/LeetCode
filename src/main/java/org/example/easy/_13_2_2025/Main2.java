package org.example.easy._13_2_2025;

public class Main2 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = minDepth(root.left);
        if(left == 0) return 1 + minDepth(root.right);
        int right = minDepth(root.right);
        if(right == 0) return  1 + left;
        return 1 + Math.min(left, right);
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
