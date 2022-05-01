/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @author giaki
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int removed = removeDuplicates(nums);
        System.out.println(removed);
        System.out.println(Arrays.toString(nums));
    }
    
    public static int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(stack.isEmpty() || stack.get(stack.size()-1)!=nums[i]){
                stack.add(nums[i]);
            }
        }
        int n = stack.size();
        for (int i = n-1; i > 0; i--) {
            nums[i]=stack.pop();
        }
        return n ;
    }
}
