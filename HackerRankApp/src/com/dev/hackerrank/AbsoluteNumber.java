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
class Difference {
    private int[] values ;
    public int maximumDifference = 0 ;

    Difference (int [] values) {
        this.values = values ;
    }

    public void computeDifference() {
        for (int i = 0 ; i< values.length-1; i++){
            for( int j = i+1; j< values.length; j++){
                int sumAbs = values[i] - values[j];
                if (Math.abs(sumAbs) > this.maximumDifference){
                    this.maximumDifference = Math.abs(sumAbs) ;
                }
            }
        }
    }


} // End of Difference class

public class AbsoluteNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}