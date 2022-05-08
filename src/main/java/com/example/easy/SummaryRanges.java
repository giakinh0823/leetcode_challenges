/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums).toString());

        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(nums).toString());
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        int l = 0;
        while (l < nums.length) {
            int r = l;
            while (r < nums.length - 1) {
                if (nums[r] + 1 != nums[r + 1]) {
                    break;
                }
                r++;
            }
            if (nums[l] != nums[r]) {
                list.add(nums[l] + "->" + nums[r]);
            } else {
                list.add(""+nums[l]);
            }
            l = r + 1;
        }
        return list;
    }
}
