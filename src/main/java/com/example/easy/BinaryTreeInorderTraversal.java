/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode p = tree;
        p.left=null;
        p.right = new TreeNode(2);
        p = p.right;
        p.left = new TreeNode(3);
        List<Integer> list = inorderTraversal(tree);
        System.out.println(list.toString());
        
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(list, root);
        return list;
    }
    
    public static void inorder(List<Integer> list, TreeNode node){
        if(node==null){
            return;
        }
        inorder(list, node.left);
        list.add(node.val);
        inorder(list, node.right);
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
