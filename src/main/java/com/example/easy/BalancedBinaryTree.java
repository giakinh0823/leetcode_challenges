/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3);
        TreeNode p = tree1;
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);

        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);
        System.out.println(isBalanced(tree1));
        
        
        TreeNode tree2 = new TreeNode(1);
        p = tree2;
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);

        p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(3);
        
        p.left.left.left = new TreeNode(4);
        p.left.left.right = new TreeNode(4);
        System.out.println(isBalanced(tree2));
        
        
        TreeNode tree3 = new TreeNode(1);
        p = tree3;
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);

        p.left.left = new TreeNode(3);
        p.right.right = new TreeNode(3);
        
        p.left.left.left = new TreeNode(4);
        p.right.right.right = new TreeNode(4);
        System.out.println(isBalanced(tree3));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return deptTree(root)>=1;
    }

    public static int deptTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // đếm node left
        int left = deptTree(node.left);
        // đếm node right
        int right = deptTree(node.right);
        // 2 node left và right không được cách nhau quá một node
        if(left==-1 || right==-1 || Math.abs(left-right)>1){
            return -1;
        }
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
