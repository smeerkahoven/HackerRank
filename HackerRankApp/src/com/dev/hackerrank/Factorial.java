/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class Factorial {
    
      static int factorial(int n) {
        if ( n == 0)
        return 1 ;

        return factorial(n-1) * n ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int result = factorial(n);
        
        System.out.println(result) ;


        scanner.close();
    }
    
}
