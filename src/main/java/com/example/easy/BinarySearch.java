/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/binary-search/
 * @author giaki
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
    
    public static int search(int[] nums, int target) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        while (start<=end) {   
            mid = start+(end-start)/2;
            if (nums[mid] == target) return mid;
            if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
