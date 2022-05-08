/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(7);

        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);

        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(9);
        inorder(tree);
        System.out.println();
        tree = invertTree(tree);
        inorder(tree);
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        return root;
    }
}
