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

class Node3 {

    Node3 left, right;
    int data;

    Node3(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearch2 {

    static void levelOrder(Node3 root) {
        //Write your code here
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, String.valueOf(root.data));

        if (root.left != null) {
            levelOrder(root.left, map, 1);
        }
        
        if (root.right != null) {
            levelOrder(root.right, map, 1);
        }
        
        String line = "";
        for(Map.Entry  e : map.entrySet()){
            line += e.getValue() + " ";
        }
        
        System.out.println(line);
    }
    
    static void levelOrder(Node3 root, HashMap<Integer, String> map, int level){
        
        if (root != null){
            
            String value = map.get(level);
            if (value != null){
                value += " "+ String.valueOf(root.data) ;
                map.put(level, value);
            }else {
                map.put(level, String.valueOf(root.data));
            }
            
        }
        
        if (root.left != null){
            levelOrder(root.left, map, level + 1);
        }
        
        if (root.right != null){
            levelOrder(root.right, map, level + 1);
        }
        
    }

    public static Node3 insert(Node3 root, int data) {
        if (root == null) {
            return new Node3(data);
        } else {
            Node3 cur;
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
        Node3 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
