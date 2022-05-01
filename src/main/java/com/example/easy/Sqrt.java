/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/sqrtx/
 * @author giaki
 */
public class Sqrt {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.print(mySqrt(x));
    }
    
    public static int mySqrt(int x) {
        if(x==1) return 1;
        long left = 0;
        long right = x;
        while(left<=right){
            long mid = left + (right - left)/2;
            if(mid*mid == x){
                return (int)mid;
            }else if(mid * mid > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            } 
        }
        return (int)right;
    }
}
