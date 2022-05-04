/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author giaki
 */
public class MinStack {

    int min;
    Stack<Integer> stack = new Stack();
    public MinStack() {
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        this.min =  Math.min(val, min);
    }
    
    public void pop() {
        if(stack.peek() == this.min){
            stack.pop();
            this.min = Integer.MAX_VALUE;
            for(int n : stack){
                if(n < this.min) this.min = n;
            }
        }
        else stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return this.min;
    }
}

class Test {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(8);
        obj.push(4);
        obj.pop();
        obj.push(5);
        obj.push(2);
        obj.pop();
        obj.push(3);
        obj.push(9);
        obj.pop();
        obj.push(5);
        obj.push(7);
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3 + "-" + param_4);
    }
}
