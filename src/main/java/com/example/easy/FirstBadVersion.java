/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/first-bad-version/
 * @author giaki
 */
public class FirstBadVersion {
    public static final int badVersion = 4;
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
    
    public static int firstBadVersion(int n) {
        int start = 1;
        int mid = 1;
        int end = n;
        int pos = 1;
        while(start<=end){
            mid = start + (end - start)/2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                pos  = mid;
                end  = mid-1;
            }else{
                start = mid+1;
            }
        }
        return pos;
    }
    
    public static boolean isBadVersion(int version){
        return version == badVersion;
    }
}
