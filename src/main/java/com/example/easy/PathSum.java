/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class PathSum {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(5);
        TreeNode p = tree1;
        p.left = new TreeNode(4);
        p.right = new TreeNode(8);

        p.left.left = new TreeNode(11);
        p.right.left = new TreeNode(13);
        p.right.right = new TreeNode(4);

        p.left.left.left = new TreeNode(7);
        p.left.left.right = new TreeNode(2);
        p.right.right.right = new TreeNode(1);

        int targetSum = 22;
        System.out.println(hasPathSum(tree1, targetSum));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                return true;
            }else{
                return false;
            }
        }

        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
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
