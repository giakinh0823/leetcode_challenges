/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));
        
        columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
        
        columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
        
        
        columnNumber = 2021;
        System.out.println(convertToTitle(columnNumber));
        
    }
    
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
          columnNumber--;
          sb.append((char) ('A' + columnNumber % 26));
          columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
