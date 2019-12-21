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
public class Java302dArray {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int maxSum = 0 ;
        for (int x = 0; x < 4;x++){
            for (int y =0 ; y<4; y++){
                
                int tmp = sumHourGlass(getHourGlass(x, y, arr));
                if (x == 0  && y == 0){
                    maxSum = tmp ;
                }
                
                if (tmp > maxSum){
                    maxSum = tmp ;
                }
            }
        }
        System.out.println(maxSum);
        scanner.close();
    }
    
    /**
     *
     * @param x
     * @param x
     * @param matrix
     * @return
     */
    public static int[][] getHourGlass(int x, int y, int[][]matrix) {
        int [][] m = new int[3][3] ;
        
        m[0][0] = matrix[x][y];
        m[0][1] = matrix[x][y+1];
        m[0][2] = matrix[x][y+2];
        
        m[1][1] = matrix[x+1][y+1];
        
        m[2][0] = matrix[x+2][y];
        m[2][1] = matrix[x+2][y+1];
        m[2][2] = matrix[x+2][y+2];
        
        return m ;
    }
    
    
    public static int sumHourGlass(int[][] matrix) {
        int sum = 0 ;
        
        sum += matrix[0][0];
        sum += matrix[0][1];
        sum += matrix[0][2];
        
        sum += matrix[1][1];
        
        sum += matrix[2][0];
        sum += matrix[2][1];
        sum += matrix[2][2];
        
        return sum;
    }
}
