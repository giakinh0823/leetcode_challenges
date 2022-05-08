/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class PowerofTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n>=2){
            if(n % 2 !=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
