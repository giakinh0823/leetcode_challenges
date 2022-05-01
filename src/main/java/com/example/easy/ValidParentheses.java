/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * @author giaki
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
        
        s = "()";
        System.out.println(isValid(s));
        
        s = "()[]{}";
        System.out.println(isValid(s));
        
        s = "(]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty()){
                Character ch = map.get(stack.get(stack.size()-1));
                if(ch!=null && ch==s.charAt(i)){
                    stack.pop();
                }else{
                    stack.add(s.charAt(i));
                }
            }else{
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
