package org.example.medium._29_8_2024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }

    public void rightView(TreeNode root, List<Integer> res, int depth) {
        if (root == null) return;
        if (depth == res.size()) res.add(root.val);
        rightView(root.right, res, depth + 1);
        rightView(root.left, res, depth + 1);
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
Binary Tree Right Side View
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of
 the nodes you can see ordered from top to bottom.


 */