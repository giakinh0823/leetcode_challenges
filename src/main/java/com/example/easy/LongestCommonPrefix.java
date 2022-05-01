/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * @author giaki
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(strs[i].length(), min);
        }
        String prefix=""; 
        Outer: for (int i = 0; i <= min; i++) {
            String tmp = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(tmp)){
                    break Outer;
                }
            }
            prefix=tmp;
        }
        return prefix;
    }
}

