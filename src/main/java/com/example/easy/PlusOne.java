/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/plus-one/
 *
 * @author giaki
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));

        int[] digits2 = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits2)));

        int[] digits3 = new int[]{1, 8, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits3)));

        int[] digits4 = new int[]{3, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits4)));

        int[] digits5 = new int[]{9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits5)));

    }

    public static int[] plusOne(int[] digits) {
        int remind = 1;
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            int sum = digits[i] + remind;
            if (sum > 9) {
                digits[i] = 0;
                remind = 1;
            } else {
                digits[i] = sum;
                remind = 0;
            }
        }
        if (remind == 1) {
            size += 1;
            int[] arr = new int[size];
            for (int i = 1; i < size ; i++) {
                arr[i] = digits[i-1];
            }
            arr[0]=remind;
            return arr;
        }else{
            int[] arr = new int[size];
            for (int i = 0; i < size ; i++) {
                arr[i] = digits[i];
            }
            return arr;
        }
    }
}
