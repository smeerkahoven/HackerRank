/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class Bitwise {

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
        int max[] = new int[t];

        Bitwise w = new Bitwise();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            vn[tItr] = n;
            kn[tItr] = k;

            max[tItr] = w.start(kn[tItr], vn[tItr]);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(max[i]);
        }
        scanner.close();
    }

    public int start(int k, int n) {

        Value[] vector = new Value[n];

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if ((i & j) < k) {
                    vector = add(i & j, vector, k);
                }
            }
        }

        Value max = null;
        for (Value v : vector) {
            if (v != null) {
                if (max == null) {

                    if (v.value > 0) {
                        max = v;
                    }

                } else {
                    if (v.value > max.value && v.value < k) {
                        max = v;
                    }
                }
            }

            if (max == null) {
                max = new Value();
                max.value = 0;
            }
        }

        return max.value;
    }

    private Value[] add(int value, Value[] vector, int k) {

        boolean found = false;

        if (value > k) {
            return vector;
        }

        if (vector[value] == null) {
            Value v = new Value();
            v.value = value;
            v.count = 1;
            vector[value] = v;
        } else {
            vector[value].count++;
        }

        return vector;
        
    }

}
