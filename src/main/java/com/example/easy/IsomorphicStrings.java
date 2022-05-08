/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giaki
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));

        s = "badc";
        t = "baba";
        System.out.println(isIsomorphic(s, t));
        
        s = "paper"; t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)+"-"+t.charAt(i));
            System.out.println(s.lastIndexOf(s.charAt(i))+"-"+t.lastIndexOf(t.charAt(i)));
            if (s.lastIndexOf(s.charAt(i)) != t.lastIndexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;    
    }
}
