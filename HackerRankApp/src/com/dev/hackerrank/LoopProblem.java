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
public class LoopProblem {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt() ;
        String words[] = new String[lines] ;
        
        scan.nextLine() ;
        for (int i= 0 ; i<lines; i++) {
            words[i] = scan.nextLine();
        }
        
        for(String s : words) {
            System.out.println(loopStringEvenOdd(s)) ;
        }
        
    }
    
    public static String loopStringEvenOdd(String  s) {
        
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        even.append(s.charAt(0));
        
        for( int i= 1 ; i< s.length() ; i++){
            char c = s.charAt(i);
            
            if ( i % 2 == 0) {
                even.append(c);
            }else {
                odd.append(c) ;
            }
            
        }
        
        return String.format("%s %s", even, odd ) ;
    }
    
}
