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
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        
        nums = new int[]{1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int mafority = -1;
        int av = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            Integer num = map.get(nums[i]);
            if (num != null) {
                map.put(nums[i], num + 1);
                if(num + 1 > av){
                    mafority=nums[i];
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return mafority;
    }
}
