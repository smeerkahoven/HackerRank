/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class EndOfFile {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        List<String> list = new ArrayList<>();

        try {
            while (null != line) {
                line = scanner.nextLine();
                list.add(line);
            }
        }catch (NoSuchElementException e){
            
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d %s\n", i + 1, list.get(i));
        }
    }

}
