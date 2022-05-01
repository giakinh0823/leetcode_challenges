/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import static com.example.easy.MergeTwoSortedLists.mergeTwoLists;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * @author giaki
 */
public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode p = list1;
        p.next = new ListNode(1);
        p = p.next;
        p.next = new ListNode(2);
        p = p.next;
        p.next = new ListNode(3);
        p = p.next;
        p.next = new ListNode(3);
        list1 = deleteDuplicates(list1);
        while (list1 != null) {
            System.out.println(list1.val);
            list1 = list1.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p!=null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            }else{
                p=p.next;
            }
        }
        return head;
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
