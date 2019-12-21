/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

/**
 *
 * @author joselanza
 */
import java.io.*;
import java.util.*;

class NodeL {

    int data;
    NodeL next;

    NodeL(int d) {
        data = d;
        next = null;
    }

}

class LinkedListDuplicate {

    public static NodeL removeDuplicates(NodeL head) {
        //Write your code here
        NodeL root = head;
        NodeL pointer = head;

        
        while (pointer != null){
            pointer.next = removeDuplicates(pointer.next, pointer.data);
            pointer = pointer.next ;
        }
        
        return head;
    }

    public static NodeL removeDuplicates(NodeL head, int value) {

        if (head != null) {
            if (head.data == value) {
                head = head.next;
                head = removeDuplicates(head, value);
            }else {
                head.next = removeDuplicates(head.next, value);
            }
            
        }
        return head;
    }

    public static NodeL insert(NodeL head, int data) {
        NodeL p = new NodeL(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            NodeL start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(NodeL head) {
        NodeL start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeL head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
