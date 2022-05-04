/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author giaki
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        maxProfit(prices);

        prices = new int[]{2, 4, 1};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int max = -1;
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[minIndex]> prices[i]){
                minIndex = i;
            }
            max = Math.max(prices[i]-prices[minIndex],max);
        }
        return max;
    }
}
