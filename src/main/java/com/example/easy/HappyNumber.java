/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class HappyNumber {

    public static void main(String[] args) {
        int n = 30;
        System.out.println(isHappy(n));

        n = 2;
        System.out.println(isHappy(n));

        n = 7;
        System.out.println(isHappy(n));

        n = 1111111;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        while (true) {
            int m = n;
            int sum = 0;
            while (m > 0) {
                sum += Math.pow(m % 10, 2);
                m = m/10;
            }
            n = sum;
            if(n<=9){
                return n==1 || n ==7;
            }
        }
    }
}
