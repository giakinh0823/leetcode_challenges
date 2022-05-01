/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/same-tree/
 *
 * @author giaki
 */
public class SameTree {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        TreeNode p = tree1;
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        p = tree2;
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        System.out.println(isSameTree(tree1, tree2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            p = queue.poll();
            q = queue.poll();

            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }

            queue.add(p.left);
            queue.add(q.left);
            queue.add(p.right);
            queue.add(q.right);
        }
        return true;
    }

    private static int size = 0;
    private static int eq = 0;

    public static void inorder(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        }
        if (p != null && q != null) {
            inorder(p.left, q.left);
        } else if (p != null) {
            inorder(p.left, q);
        } else if (q != null) {
            inorder(p, q.left);
        }
        if (p != null && q != null && p.val == q.val) {
            eq++;
        }
        size++;
        if (p != null && q != null) {
            inorder(p.right, q.right);
        } else if (p != null) {
            inorder(p.right, q);
        } else if (q != null) {
            inorder(p, q.right);
        }
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
