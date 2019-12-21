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

public class QueuesStack {
    // Write your code here.

   class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
        }

        public void setData(char data) {
            this.data = data;
        }

        public char getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        ;

        public Node getNext() {
            return this.next;
        }

    }
    class Queue {

        Node root;

        public Queue() {
            root = null;
        }

        public void queue(char data) {
            if (root == null) {
                root = new Node(data);
            } else {
                Node next = new Node(data);
                next.setNext(root);
                root = next;
            }
        }

        public Node dequeue() {
            if (root == null) {
                return null;
            } else {
                Node tmp = root;
                root = root.getNext();
                return tmp;
            }
        }

    }

    class Stack {

        Node root;

        public void push(char c) {
            if (root == null) {
                root = new Node(c);
            } else {
                root.setNext(push(c, root.getNext()));
            }
        }

        public Node pop() {
            if (root != null) {
                Node tmp = root;
                root = root.getNext();
                return tmp;
            }
            return null;
        }

        private Node push(char c, Node next) {
            if (next == null) {
                next = new Node(c);
                return next;
            } else {
                next.setNext(push(c, next.getNext()));
                return next;
            }
        }
    }

    private Queue queue = new Queue();
    private Stack stack = new Stack();

    public void enqueueCharacter(char c) {
        queue.queue(c);
    }

    public void pushCharacter(char c) {
        stack.push(c);
    }

    public char popCharacter() {
        Node n = stack.pop();
        if (n != null) {
            return n.data;
        }

        return ' ';
    }

    public char dequeueCharacter() {
        Node n = queue.dequeue();
        if (n != null) {
            return n.getData();
        }

        return ' ';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesStack p = new QueuesStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}