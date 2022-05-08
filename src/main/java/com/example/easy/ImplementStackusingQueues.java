/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author giaki
 */
public class ImplementStackusingQueues {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top(); // return 2
        myStack.pop(); // return 2
        myStack.empty(); // return False
        for (Iterator iterator = myStack.queue.iterator(); iterator.hasNext();) {
            Integer next = (Integer) iterator.next();
            System.out.println(next);
        }
    }
}

class MyStack {

    Queue<Integer> queue;
    int top = -1;

    public MyStack() {
        queue = new PriorityQueue<>();
        top = -1;
    }

    public void push(int x) {
        queue.add(x);
        top++;
    }

    public int pop() {
        Queue<Integer> queue2 =  new PriorityQueue<>();
        for (int i = 0; i < top; i++) {
            queue2.add(queue.poll());
        }
        int x = queue.poll();
        queue= queue2;
        top--;
        return x;
    }

    public int top() {
        Queue<Integer> queue2 =  new PriorityQueue<>();
        for (int i = 0; i < top; i++) {
            queue2.add(queue.poll());
        }
        int x = queue.peek();
        queue2.add(queue.poll());
        queue= queue2;
        return x;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
