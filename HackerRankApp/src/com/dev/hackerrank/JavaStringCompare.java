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
public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String dictionary[] = new String[s.length() - k + 1];
        for (int i = 0; i < s.length() - k + 1; i++) {
            dictionary[i] = s.substring(i, k + i);
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        insertionSort(dictionary, dictionary.length);

        smallest = dictionary[0];
        largest = dictionary[dictionary.length - 1];

        return smallest + "\n" + largest;
    }

    /**
     *
     * @param arr
     * @param n
     */
    static void insertionSort(String[] arr, int n) {
        if (n <= 1) {
            return;
        }
        insertionSort(arr, n - 1);

        String last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j].compareTo(last) > 0) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
