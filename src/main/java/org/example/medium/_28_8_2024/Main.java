package org.example.medium._28_8_2024;

public class Main {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode result;
        result = lowestCommonAncestor(root.left, p, q);
        if (result == null) {
            result = lowestCommonAncestor(root.right, p, q);
        }
        if(result == null) {
            result = dfs(root, p) && dfs(root, q) ? root : null;
        }
        return result;
    }

    public boolean dfs(TreeNode root, TreeNode contains) {
        if (root == null) return false;
        if (root == contains) {
            return true;
        }
        return dfs(root.left, contains) || dfs(root.right, contains);
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


/*
Lowest Common Ancestor of a Binary Tree
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as
the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”


 */