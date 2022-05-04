/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(str));

        str = "a.";
        System.out.println(isPalindrome2(str));

        str = "0P";
        System.out.println(isPalindrome2(str));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length();
        int j = n - 1;
        char c = s.charAt(i);
        char k = s.charAt(j);
        while (i < j) {
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
            } else if ((c < 97 || c > 122) && (c < 48 || c > 57)) {
                i++;
                c = s.charAt(i);
                continue;
            }
            if (k >= 65 && k <= 90) {
                k = (char) (k + 32);
            } else if ((k < 97 || k > 122) && (k < 48 || k > 57)) {
                j--;
                k = s.charAt(j);
                continue;
            }
            System.out.println(c + "-" + k);
            if (c != k) {
                return false;
            }
            i++;
            j--;
            c = s.charAt(i);
            k = s.charAt(j);
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                list.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            if (list.get(i) != list.get(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
