/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CHEYO
 */
public class StringIntroduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int size = A.length() + B.length() ;


        System.out.printf("%d\n", size);
        System.out.printf( A.compareTo(B) > 0 ? "Yes\n": "No\n" ) ;

        char [] aVector = A.toCharArray() ;
        char [] bVector = B.toCharArray() ;
        aVector[0] = convert(aVector[0])  ;
        bVector[0] = convert(bVector[0])  ;
        
        System.out.printf("%s %s\n" , new String(aVector) , new String(bVector));
        
    }
    
    public static char convert(char c) {
        char asci = 32;
        char max = 90;
        char min = 65 ;
        c = (c >= min && c<= max )? c: (char) (c - asci)  ;
        return c ;
    }
    
}
