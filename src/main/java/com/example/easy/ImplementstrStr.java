/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/implement-strstr/submissions/
 * @author giaki
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack  = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
    
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
