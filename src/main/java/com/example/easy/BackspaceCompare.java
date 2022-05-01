/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 * @author giaki
 */

public class BackspaceCompare {
    
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));
        
        
        s = "ab##";
        t = "c#d#";
        System.out.println(backspaceCompare(s,t));
        
        
        s = "a#c";
        t = "b";
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

    public static String backspace(String s) {
        Stack<Character> stack = new Stack();
        for (Character c : s.toCharArray()) {
            if(c!='#'){
                stack.add(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}