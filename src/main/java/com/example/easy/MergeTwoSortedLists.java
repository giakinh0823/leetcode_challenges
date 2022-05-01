/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * @author giaki
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode p = list1;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(4);
     
        ListNode list2 = new ListNode(1);
        p = list2;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(4);
        
        ListNode newList = mergeTwoLists(list1, list2);
        while (newList!=null) {
            System.out.println(newList.val);
            newList = newList.next;
        }
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode p = newList;
        while (list1!=null && list2!=null) {
           if(list1.val<=list2.val){
                p.next = new ListNode(list1.val);
               list1=list1.next;
           }else{
               p.next = new ListNode(list2.val);
               list2=list2.next;
           }
           p = p.next;
        }
        if(list1!=null){
            p.next=list1;
        }
        if(list2!=null){
            p.next=list2;
        }
        return newList=newList.next;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
