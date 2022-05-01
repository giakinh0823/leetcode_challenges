/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 * @author giaki
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length-1].length();
    }
}
