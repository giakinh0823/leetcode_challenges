/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    
    public static int searchInsert(int[] nums, int target) {
        int beg = 0;
        int end = nums.length-1;
        int mid = 0;
        if(target>nums[end]) return end+1;
        while(beg<=end){
            mid = beg + (end - beg) / 2;
            if(target==nums[mid]) return mid;
            if(mid > 0 && target<nums[mid] && target>nums[mid-1]) return mid;
            if(target<nums[mid]){
                end = mid -1;
            }else{
                beg = mid + 1;
            }
        }
        return 0;
    }
}
