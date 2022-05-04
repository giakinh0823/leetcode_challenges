/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 *
 * @author giaki
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode p = node;
        p.next = new ListNode(2);
        ListNode q = p.next;
        q.next = new ListNode(0);
        q = q.next;
        q.next = new ListNode(-4);
        q = q.next;
        q.next = p.next;
        System.out.println(hasCycle(node));
    }

    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode p = head;
        ListNode q = head.next;
        while(p!=null && q!=null && q.next!=null){
            if(p==q){
                return true;
            }
            p=p.next;
            q=q.next.next;
        };
        return false;
    }
}

class  ListNode{

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
