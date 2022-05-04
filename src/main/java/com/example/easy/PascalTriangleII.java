/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import static com.example.easy.PascalTriangle.generate;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * @author giaki
 */
public class PascalTriangleII {

    public static void main(String[] args) {
        int numRows = 5;
        for (Integer itme : getRow(numRows)) {
            System.out.print(itme+" ");
        }
    }

    public static  List<Integer> getRow(int rowIndex) {
         List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= rowIndex+1; i++) {
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            if (i > 1) {
                for (int j = 1; j < i - 1; j++) {
                    int left = list.get(i - 2).get(j - 1);
                    int right = list.get(i - 2).get(j);
                    nums.add(left+right);
                }
                nums.add(1);
            }
            list.add(nums);
        }
        return list.get(rowIndex);
    }
}
