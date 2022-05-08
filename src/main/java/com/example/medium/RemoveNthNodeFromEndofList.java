/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medium;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        if (list.size() - n > 0) {
            list.get(list.size() - n - 1).next = list.get(list.size() - n).next;
        } else {
            if (list.size() == 1) {
                return null;
            }else{
                return list.get(1);
            }
        }
        return head;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
