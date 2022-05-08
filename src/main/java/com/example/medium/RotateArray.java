/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medium;

import java.util.Arrays;

/**
 *
 * @author giaki
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int d = k % nums.length;
        if (d != 0) {
            int[] arr = new int[d];
            int[] brr = new int[nums.length - d];
            int h = 0;
            for (int i = nums.length - d; i < nums.length; i++) {
                arr[h] = nums[i];
                h++;
            }
            for (int i = 0; i < nums.length - d; i++) {
                brr[i] = nums[i];
            }
            h = 0;
            for (int i = 0; i < arr.length; i++) {
                nums[h] = arr[i];
                h++;
            }
            for (int i = 0; i < brr.length; i++) {
                nums[h] = brr[i];
                h++;
            }
        }
    }
}
