/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joselanza
 * 
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 */
public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String converted = "" ;
        try {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssaa");
            Date date  =  format.parse(s) ;
            
            SimpleDateFormat formatAns = new SimpleDateFormat("HH:mm:ss");
            converted = formatAns.format(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(TimeConversion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  converted ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String date = "07:05:45PM" ;
        
        System.out.println(TimeConversion.timeConversion(date));
    }

}
