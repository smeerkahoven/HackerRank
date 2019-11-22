/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toUpperCase();
        b = b.toUpperCase();

        for (int index = 0; index < a.length(); index++) {

            char ia = a.toCharArray()[index];

            char ib =  b.toCharArray()[index];
            
            int counteria = counter(b, ia);
            int counterib = counter (a, ia);
            
            if (counteria == counterib)
                continue ;
            else {
                return false ;
            }

        }
        
        return true ;
    }
    
    static int counter (String value, char cx) {
        int c = 0 ; 
        
        for (int i = 0; i< value.length() ; i++){
            if (cx == value.toCharArray()[i]) {
                c++ ;
            }
        }
        
        return c ;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
