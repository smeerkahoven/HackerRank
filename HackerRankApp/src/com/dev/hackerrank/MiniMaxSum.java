/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author joselanza
 *
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 *
 * For example, . Our minimum sum is and our maximum sum is . We would print
 *
 * 16 24 Function Description
 *
 * Complete the miniMaxSum function in the editor below. It should print two
 * space-separated integers on one line: the minimum sum and the maximum sum of
 * of elements.
 *
 * miniMaxSum has the following parameter(s):
 *
 * arr: an array of integers Input Format
 *
 * A single line of five space-separated integers.
 *
 * Constraints
 *
 *
 * Output Format
 *
 * Print two space-separated long integers denoting the respective minimum and
 * maximum values that can be calculated by summing exactly four of the five
 * integers. (The output can be greater than a 32 bit integer.)
 *
 * Sample Input
 *
 * 1 2 3 4 5
 * Sample Output
 *
 * 10 14 Explanation
 *
 * Our initial numbers are , , , , and . We can calculate the following sums
 * using four of the five integers:
 *
 * If we sum everything except , our sum is . If we sum everything except , our
 * sum is . If we sum everything except , our sum is . If we sum everything
 * except , our sum is . If we sum everything except , our sum is . Hints:
 * Beware of integer overflow! Use 64-bit Integer.
 */
public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        long maxSum = 0;
        long minSum = 0;

        minSum += arr[0] ;
        maxSum +=arr[arr.length-1];
        
        for (int i = 1; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[i];
        }
        
        System.out.println(String.format("%d %d", minSum, maxSum));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
