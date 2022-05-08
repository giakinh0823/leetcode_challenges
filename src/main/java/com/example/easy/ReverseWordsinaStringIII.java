/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class ReverseWordsinaStringIII {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        s = reverseWords(s);
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            result+=" "+stringBuilder.reverse().toString();
        }
        return result.trim();
    }
}
