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
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])!=null){
                return true;
            }else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
