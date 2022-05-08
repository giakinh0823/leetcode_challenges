/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giaki
 */
public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        
    }
    
    public static ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head!=null){
            list.add(head);
            head = head.next;
        }
        if(!list.isEmpty()){
            return list.get(list.size()/2);
        }
        return null;
    }
}
