/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class Bitwise {
    
    class Node2 {

    Node2 left, right;
    int data;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

    private static final Scanner scanner = new Scanner(System.in);

    class Value {

        int value;
        int count = 0;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int vn[] = new int[t];
        int kn[] = new int[t];
        int max[] = new int[t] ;

        Bitwise w = new Bitwise();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            vn[tItr] = n;
            kn[tItr] = k;
            
             max [tItr] = w.start(kn[tItr], vn[tItr]);
        }

        /*for (int i = 0; i < t; i++) {
           
        }*/
        
        for (int i = 0; i < t; i++) {
            System.out.println(max[i]);
        }

        scanner.close();
    }

    public int start(int k, int n) {

        ArrayList<Value> vector = new ArrayList();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                //System.out.println(String.format("%d,%d,%d", i, j, i&j));
                if ((i & j) < k) {
                    add(i & j, vector, k);
                }
            }
        }

        Value max = null;
        for (Value v : vector) {
            //System.out.println(String.format("%d,%d",v.value, v.count));
            if (max == null) {
                if (v.value > 0) {
                    max = v;
                }
            } else {
                if (v.value > max.value && v.value < k) {
                    max = v;
                }
//                if (v.count >= max.count && v.value < k && v.value > max.value && max.value > 0) {
//                    max = v;
//                }
            }
        }

        if (max == null) {
            max = new Value();
            max.value = 0;
        }
        
        return max.value ;

    }

    private void add(int value, ArrayList<Value> vector, int k) {

        boolean found = false;
//        if (value == 0)
//            return ;

        for (Value v : vector) {
            if (v.value == value) {
                found = true;
                v.count = v.count + 1;
                break;
            }
        }

        if (!found && value < k) {
            Value v = new Value();
            v.value = value;
            v.count = 1;
            vector.add(v);
        }

    }

}
