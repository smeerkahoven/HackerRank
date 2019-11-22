/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author joselanza
 */
public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> r = new ArrayList<>();
        for (Integer grade : grades) {

            int fiveMultiple = grade / 5;
            int nextMultiple = (fiveMultiple + 1) * 5;
            int result = nextMultiple - grade;

            if (nextMultiple >= 40) {
                if (result < 3) {
                    grade = nextMultiple;
                }
            }
            
            r.add(grade);
        }

        return r;

    }

    public static void main(String args[]) {

        List<Integer> l = Arrays.asList(73, 67, 38, 33);
        System.out.println(GradingStudents.gradingStudents(l));

    }

}
