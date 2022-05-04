/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * @author giaki
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 4};
        nums = sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            // đổi chổ số lẻ ở trước và số chẵn phía sau
            if (nums[i] % 2 > nums[j] % 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            // nếu nums[i] là số chẵn thì tăng i
            if (nums[i] % 2 == 0) {
                i++;
            }
            // nếu nums[j] là số lẻ thì giảm j
            if (nums[j] % 2 != 0) {
                j--;
            }
        }
        return nums;
    }
}
