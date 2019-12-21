/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author joselanza
 */
public class RegexPatterns{

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
        final String regexEmail = "^[a-z]+@[a-z]+.[a-z]{3,6}+";
        final String string = "Jose@mail.comasdf";

//        final Pattern pattern2 = Pattern.compile(regexEmail, Pattern.MULTILINE);
//        final Matcher matcher2 = pattern2.matcher(string);
//        while (matcher2.find()) {
//            System.out.println("Full match: " + matcher2.group(0));
//        }
        try {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            ArrayList<RegexPatterns> map = new ArrayList<>();

            for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");

                String firstName = firstNameEmailID[0];

                String emailID = firstNameEmailID[1];

                final Pattern pattern = Pattern.compile(regexEmail, Pattern.MULTILINE);
                final Matcher matcher = pattern.matcher(emailID);
                
                final Pattern pattern2 = Pattern.compile(regexAz, Pattern.MULTILINE);
                final Matcher matcher2 = pattern2.matcher(firstName);

                if (matcher.find() && matcher2.find()
                        && firstName.length()<= 20
                        && emailID.length() <=20
                        ) {
                    RegexPatterns u = new RegexPatterns(firstName, emailID);
                    map.add( u);
                }
            }
            
            map
                    .stream()
                    .sorted(Map.Entry.comparingByKey() )
                    .forEach(System.out::println);

            
            scanner.close();
        } catch (Exception e) {

        }
    }

}
