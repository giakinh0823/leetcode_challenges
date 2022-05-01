package com.example.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * https://leetcode.com/problems/roman-to-integer/
 * @author giaki
 */
public class RomantoInteger {

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
        
        s = "LVIII";
        System.out.println(romanToInt(s));
        
        s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int ans = 0;
        int size = s.length();
        int i=0;
        while(i<size){
            if(symbol.get(s.charAt(i))!=null){
                char c =  s.charAt(i);
                if (c == 'I' || c == 'X' || c == 'C') {
                    if(i+1<size){
                        char k = s.charAt(i+1);
                        int num1= symbol.get(c);
                        int num2 = symbol.get(k);
                        if(k!=c && num2 > num1){
                            ans+= num2 - num1;
                            i++;
                        }else{
                            ans+=symbol.get(c);
                        }
                    }else{
                        ans+=symbol.get(c);
                    }
                }else{
                    ans+=symbol.get(c);
                }
            }
            i++;
        }
        return ans;
    }
}

