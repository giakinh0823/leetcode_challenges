/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author giaki
 */
public class PermutationinString {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("abc", "bbbca"));
        System.out.println(checkInclusion("hello", "ooolleoooleh"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        for (int i = 0; i < n; i++) {
            counts[s1.charAt(i)-'a']+=1;
            counts[s2.charAt(i)-'a']-=1;
        }
        if(isValid(counts)) return true;
        for (int i = n; i < m; i++) {
            counts[s2.charAt(i)-'a']-=1;
            counts[s2.charAt(i-n)-'a']+=1;
            if(isValid(counts)) return true;
        }
        return false;
    }

    public static boolean isValid(int [] counts){
        for (int i = 0; i < counts.length; i++) {
            if(counts[i]!=0) return false;
        }
        return true;
    }
 

}
