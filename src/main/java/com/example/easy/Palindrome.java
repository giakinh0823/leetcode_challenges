/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 * @author giaki
 */
public class Palindrome {
    public static void main(String[] args) {
        int x = 112211;
        System.out.println(isPalindrome(x));
    }
    
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int i = 0;
        while(i<str.length()/2 && str.charAt(i)==str.charAt(str.length()-i-1)){
            i++;
        }
        return i==str.length()/2;
    }
}

