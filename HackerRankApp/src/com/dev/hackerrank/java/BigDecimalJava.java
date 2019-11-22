/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class BigDecimalJava {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        //Write your code here
        HashMap<String, BigDecimal> map = new HashMap<>();

        for (String v : s) {
            if (v != null) {
                map.put(v, new BigDecimal(v).setScale(2, BigDecimal.ROUND_HALF_UP));
            }
        }

        ArrayList<String> a = new ArrayList<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> {
                    a.add(e.getKey());
                });

        int x = 0;
        for (int i = a.size() - 1; i > -1; i--) {
            s[x] = a.get(i);
            x++;
        }
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
