/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/symmetric-tree/
 *
 * @author giaki
 */
public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode p = tree1.left;
        TreeNode q = tree1.right;
        p = new TreeNode(3);
        q = new TreeNode(3);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q.left = new TreeNode(3);
        q.right = new TreeNode(2);
        System.out.println(isSymmetric(tree1));
    }

    public static boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public static boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else if (node1.val == node2.val) {
            return check(node1.left, node2.right) && check(node1.right, node2.left);
        }
        return false;
    }
}

class TreeNode {

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
