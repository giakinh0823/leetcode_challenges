/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * @author giaki
 */
public class MaximumDepthofBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode p = tree;
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);
        p.right.right = new TreeNode(7);
        p.right.left = new TreeNode(15);
        System.out.println(maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
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
