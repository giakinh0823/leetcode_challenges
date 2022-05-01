/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "0";
        String b = "0";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder results = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            sum = carry;
            sum += a.charAt(i) - '0';
            sum += b.charAt(j) - '0';
            carry = sum / 2;
            results.append(sum % 2);
            i--;
            j--;
        }

        while (i >= 0) {
            sum = carry;
            sum += a.charAt(i) - '0';
            carry = sum / 2;
            results.append(sum % 2);
            i--;
            j--;
        }
        while (j >= 0) {
            sum = carry;
            sum += b.charAt(j) - '0';
            carry = sum / 2;
            results.append(sum % 2);
            i--;
            j--;
        }
        if(carry>0){
            results.append(carry);
        }
        return results.reverse().toString();
    }
}
