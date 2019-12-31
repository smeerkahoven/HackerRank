/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author joselanza
 */
public class RegexPatterns {

    String firstName;
    String email;

    public RegexPatterns(String f, String e) {
        this.firstName = f;
        this.email = e;
    }

    @Override
    public String toString() {
        return this.firstName;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String regexAz = "^[a-z]+";
        final String regexEmail = "^[a-z.]+@gmail.com";
        final String string = "julia@julia.mem";

//        final Pattern pattern = Pattern.compile(regexEmail, Pattern.MULTILINE);
//        final Matcher matcher = pattern.matcher(string);
//
//        if (matcher.matches())
//            System.out.println(matcher.group());
        try {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            ArrayList<String> map = new ArrayList<>();

            for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");

                String firstName = firstNameEmailID[0];

                String emailID = firstNameEmailID[1];

                final Pattern pattern = Pattern.compile(regexEmail, Pattern.MULTILINE);
                final Matcher matcher = pattern.matcher(emailID);

                final Pattern pattern2 = Pattern.compile(regexAz, Pattern.MULTILINE);
                final Matcher matcher2 = pattern2.matcher(firstName);

                boolean find1 = matcher.find();
                boolean find2 = matcher2.find();

                System.out.println(String.format(" %b, %b, %s", find1, find2, emailID));

                if (find1 && find2
                        && firstName.length() <= 20
                        && emailID.length() <= 50) {

                    map.add(firstName);
                }
            }
            
            Collections.sort(map);
            
            map.forEach(System.out::println);


            scanner.close();
        } catch (Exception e) {

        }
    }

}
