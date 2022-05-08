/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;

/**
 *
 * @author giaki
 */
public class SquaresofaSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

        nums = new int[]{-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int d = nums.length - 1;
        int[] arr = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                arr[d--] = (int) Math.pow(Math.abs(nums[i]), 2);
                i++;
            } else {
                arr[d--] = (int) Math.pow(Math.abs(nums[j]), 2);
                j--;
            }
        }
        return arr;
    }
}
