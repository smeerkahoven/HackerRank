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
public class JavaLoops {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String[] loop  = new String[t];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            loop[i] = doLoop(a, b, n);
        }
        
        for (int i = 0 ; i< t; i++){
            System.out.println(loop[i]);
        }
        in.close();
        
    }
    
    
    public static String doLoop(int a, int b, int n) {
        
        StringBuilder s = new StringBuilder() ;
        int x = a  ;
        
        for (int i = 0 ; i< n ; i++){
            x += (int) Math.pow(2, i) * b;
            s.append(x).append(" ") ;
        }
        
        x = x+ a ;
        
        return s.toString() ;
    }
    
}
