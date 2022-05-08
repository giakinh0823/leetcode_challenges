/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class ReverseBits {

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int ans = 0;
        int totalBits = 32;
        while (totalBits > 0) {
            ans += (long)(Math.pow(2, 32 - totalBits) * ((n >> --totalBits) & 1));
        }
        return ans;
    }
}
