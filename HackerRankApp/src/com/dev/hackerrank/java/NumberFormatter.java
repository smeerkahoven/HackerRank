/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class NumberFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale locale = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String us = formatter.format(payment);

        locale = new Locale("zh", "CN");
        formatter = NumberFormat.getCurrencyInstance(locale);
        String china = formatter.format(payment);

        locale = new Locale("en", "IN");
        formatter = NumberFormat.getCurrencyInstance(locale);
        String india = formatter.format(payment);

        locale = new Locale("fr", "FR");
        formatter = NumberFormat.getCurrencyInstance(locale);
        String france = formatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
