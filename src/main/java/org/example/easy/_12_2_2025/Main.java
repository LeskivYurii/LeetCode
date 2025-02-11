package org.example.easy._12_2_2025;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    //Cycles option
/*    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        if(p == null && q == null) {
            return true;
        }
        pList.add(p);
        qList.add(q);

        while (!pList.isEmpty() && !qList.isEmpty()) {
            TreeNode pNode = pList.removeLast();
            TreeNode qNode = qList.removeLast();
            if(pNode == null && qNode != null || qNode == null && pNode != null) {
                return false;
            }
            if(pNode.left != null && qNode.left != null) {
                pList.addLast(pNode.left);
                qList.addLast(qNode.left);
            }

            if(pNode.left == null && qNode.left != null || qNode.left == null && pNode.left != null) {
                return false;
            }

            if(pNode.right != null && qNode.right != null) {
                pList.addLast(pNode.right);
                qList.addLast(qNode.right);
            }

            if(pNode.right == null && qNode.right != null || qNode.right == null && pNode.right != null) {
                return false;
            }

            if(pNode.val != qNode.val) {
                return false;
            }
        }

        return pList.isEmpty() && qList.isEmpty();
    }*/

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
