/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * @author giaki
 */
public class MinimumDepthofBinaryTree {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3);
        TreeNode p = tree1;
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);

        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);
        System.out.println(minDepth(tree1));
    }

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        int min = Math.min(left, right)+1;
        return min > 1 ? min : Math.max(left, right)+1;
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
