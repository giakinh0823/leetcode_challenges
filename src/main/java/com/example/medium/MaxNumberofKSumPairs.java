/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author giaki
 */
public class MaxNumberofKSumPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
        
        nums = new int[]{3,1,3,4,3};
        k = 6;
        System.out.println(maxOperations(nums, k));
        
        nums = new int[]{2,2,2,3,1,1,4,1};
        k = 4;
        System.out.println(maxOperations(nums, k));
        
        nums = new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        k = 2;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num: nums){
            if(map.containsKey(num) && map.get(num)>0){
                count++;
                map.put(num,map.get(num)-1);
            }else{
                map.put(k - num,map.getOrDefault(k - num,0)+1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println(key+"-"+value);
        });
        return count;
    }
}
