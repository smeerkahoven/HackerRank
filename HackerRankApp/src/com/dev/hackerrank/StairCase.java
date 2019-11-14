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
 *
 * Consider a staircase of size :
 *
 * #
 * ## ### #### Observe that its base and height are both equal to , and the
 * image is drawn using # symbols and spaces. The last line is not preceded by
 * any spaces.
 *
 * Write a program that prints a staircase of size .
 *
 * Function Description
 *
 * Complete the staircase function in the editor below. It should print a
 * staircase as described above.
 *
 * staircase has the following parameter(s):
 *
 * n: an integer Input Format
 *
 * A single integer, , denoting the size of the staircase.
 *
 * Constraints
 *
 * .
 *
 * Output Format
 *
 * Print a staircase of size using # symbols and spaces.
 *
 * Note: The last line must have spaces in it.
 *
 * Sample Input
 *
 * 6
 * Sample Output
 *
 * #
 * ## ### #### ##### ###### Explanation
 *
 * The staircase is right-aligned, composed of # symbols and spaces, and has a
 * height and width of .
 */
public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        String stairs = "" ;
        for (int rows = 0; rows < n; rows++) {
            for (int i = n; i > 0; i--) {
                if (i > rows+1) {
                    stairs += " " ;
                }else {
                    stairs += "#" ;
                }
            }
            
            stairs +="\n" ;
        }
        
        System.out.println(stairs) ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
