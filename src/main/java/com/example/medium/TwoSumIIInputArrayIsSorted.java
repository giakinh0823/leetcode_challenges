/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giaki
 */
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        numbers = twoSum(numbers, 9);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r && numbers[l]+numbers[r]!=target){
            if(numbers[l]+numbers[r]<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{l+1,r+1};
    }
}
