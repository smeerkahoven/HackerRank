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
import java.util.*;
import java.io.*;

class Node2 {

    Node2 left, right;
    int data;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearch {

    public static int getHeight(Node2 root) {
        //Write your code here

        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = getHeight(root.left, 0);
        }

        if (root.right != null) {
            right = getHeight(root.right, 0);
        }

        return left > right ? left : right;
    }

    public static int getHeight(Node2 root, int size) {

        int left = 0;
        int right = 0;

        if (root.left == null && root.right == null) {
            return size + 1;
        }

        if (root.left != null) {
            left += getHeight(root.left, left);
        } 
        
        if (root.right != null) {
            right += getHeight(root.right, right);
        }

        return left > right ? left + 1 : right + 1;

    }

    public static Node2 insert(Node2 root, int data) {
        if (root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node2 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
