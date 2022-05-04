/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *
 * @author giaki
 */
public class PascalTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        for (List<Integer> list : generate(numRows)) {
            System.out.println(list.toString());
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            if (i > 1) {
                for (int j = 1; j < i - 1; j++) {
                    int left = list.get(i - 2).get(j - 1);
                    int right = list.get(i - 2).get(j);
                    nums.add(left + right);
                }
                nums.add(1);
            }
            list.add(nums);
        }
        return list;
    }
}
