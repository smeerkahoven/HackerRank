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
public class BubbleSort {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Write Your Code Here
        int swap = 0 ;
        for (int i = 0 ; i< a.length-1; i++){
            for(int j= i+1; j<a.length;j++){
                if (a[i]> a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp ;
                    swap++ ;
                }
            }
        }

        System.out.println(String.format("Array is sorted in %d swaps.", swap)) ;
        System.out.println(String.format("First Element: %d", a[0])) ;
        System.out.println(String.format("Last Element: %d", a[a.length-1])) ;

    }
    
}
