/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/remove-element/
 *
 * @author giaki
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int removed = removeElement(nums, 2);
        System.out.println(removed);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                queue.add(i);
                nums[i] = -1;
                size++;
            }
        }
        int d = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != -1 && d < size) {
                int index = queue.poll();
                nums[index] = nums[i];
                d++;
            }
        }

        return nums.length - size;
    }
}
