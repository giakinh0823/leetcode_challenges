/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author giaki
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int d= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[d]=nums[i];
                d++;
            }
        }
        for (int i = d; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
