/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * @author giaki
 */
public class ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        sortedArrayToBST(nums);
        TreeNode node = sortedArrayToBST(nums);
    }

    public static TreeNode helper(int[] arr, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr, l, mid - 1);
        node.right = helper(arr, mid + 1, r);
        return node;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
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
