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
public class TimeAndComplexity {

    public static boolean isPrime(int a) {

        if (a == 1) {
            return false;
        }

        if (a == 2) {
            return true;
        }

        return isPrime(a, 2);
    }

    public static boolean isPrime(int value, int index) {

        for (int i = 2; i <= value / 2; i++) {

            if ((value % i == 0)) {
                return false;
            }
        }

        return true ;
        //return isPrime(value, index + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int value[] = new int[T];
        int index = 0;
        while (index < T) {
            value[index] = sc.nextInt();
            index++;
        }

        for (int i : value) {
            System.out.println(isPrime(i) ? "Prime" : "Not prime");
        }

    }

}
