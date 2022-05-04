/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));

        columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
        
        columnTitle = "FXSHRXW";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        int n =  columnTitle.length();
        for (int i = 0; i < n; i++) {
            int c = columnTitle.charAt(n-i-1);
            sum += (c - 'A' + 1) * Math.pow(26, i);
        }
        return sum;
    }
}
