
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joselanza
 */
public class Solution {

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

    public char dequeCharacter() {
        Node n = queue.dequeue();
        if (n != null) {
            return n.getData();
        }

        return ' ';
    }

    public void print() {
        Node n = null;
        while ((n = queue.dequeue()) != null) {
            System.out.print(n.getData());
        }

        n = null;

        System.out.println("-");
        
        while ((n = stack.pop()) != null) {
            System.out.print(n.getData());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        for (char c : s) {
            p.enqueueCharacter(c);
            p.pushCharacter(c);
        }

        p.print();

    }

}
