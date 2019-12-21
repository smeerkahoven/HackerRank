/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class Binary {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = "";

        int value = n;
        int modvalue = 0;

        while (value > 0) {
            modvalue = value % 2;
            value = value / 2;

            binary += modvalue;
        }

        char uno = '1';
        char zero = '0';
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == uno) {
                maxcount++;
            } else if (binary.charAt(i) == zero) {
                if (maxcount > count) {
                    count = maxcount;
                }
                maxcount = 0;
            }
        }

        if (maxcount > count) {
            count = maxcount;
        }

        System.out.println(binary);
        System.out.println(count);

        scanner.close();
    }

}
