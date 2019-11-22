/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.util.Scanner;

/**
 *
 * ================================ java 100 cpp 065 python 050
 * ================================
 *
 * @author joselanza
 */
public class FormattinOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aux[] = new String[3];
        int auxi[] = new int[3];
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            aux[i] = s1;
            auxi[i] = x;
        }

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-16s %03d\n", aux[i], auxi[i]);
        }

        System.out.println("================================");

    }

}
