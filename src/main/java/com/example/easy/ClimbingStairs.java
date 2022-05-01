/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * @author giaki
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
    
    // fibonaci
    public static int climbStairs(int n) {
        int f1 = 1;
        int f2 = 1;
        for(int i=1; i<n; i++){
            int temp = f1;
            f1 = f1 + f2;
            f2 = temp;
        }
        return f1;
    }
}
