/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giaki
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};
        System.out.println(singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            // toán tử Exclusive OR
            unique = unique ^ num;
        }
        return unique;
    }
}
