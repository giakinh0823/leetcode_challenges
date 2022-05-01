/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * @author giaki
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.print(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] ans = new int[n + m];
        int d = 0;
        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                ans[d] = nums1[i];
                d++;
                ans[d] = nums2[j];
                i++;
                j++;
            } else if(nums1[i]<nums2[j]){
                ans[d] = nums1[i];
                i++;
            }else{
                ans[d] = nums2[j];
                j++;
            }
            d++;
        }
        while (i < m) {
            ans[d] = nums1[i];
            d++;
            i++;
        }
        while (j < n) {
            ans[d] = nums2[j];
            d++;
            j++;
        }
        for (int k = 0; k < ans.length; k++) {
            nums1[k]=ans[k];
        }
    }
}
