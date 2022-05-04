/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class BinaryTreePostorderTraversal {
     public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        List<Integer> list = preorderTraversal(node);
        System.out.println(list.toString());
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    
    public static void preorder(TreeNode rootNode,List<Integer> list){
        if(rootNode==null){
            return;
        }
        preorder(rootNode.left, list);
        preorder(rootNode.right, list);
        list.add(rootNode.val);
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
