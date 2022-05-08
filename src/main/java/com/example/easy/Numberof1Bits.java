/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class Numberof1Bits {

    public static void main(String[] args) {

    }

    public static int hammingWeight(int n) {
        int d = 0;
        int totalBits = 32;
        while (totalBits > 0) {
            d += ((n >> --totalBits) & 1) == 1 ? 1 : 0;
        }
        return d;
    }
}
