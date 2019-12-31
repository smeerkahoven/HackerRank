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
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joselanza
 */
public class Hackos {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();

            String[] date1 = line1.split(" ");
            String[] date2 = line2.split(" ");

            line1 = line1.replace(" ", "/");
            line2 = line2.replace(" ", "/");

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            Date d1 = format.parse(line1);
            Date d2 = format.parse(line2);

            int hackos = 0;

            if (d2.getTime() < d1.getTime()) {
                int yearDiff = Math.abs(Integer.parseInt(date1[2]) - Integer.parseInt(date2[2]));
                int monthDiff = Math.abs(Integer.parseInt(date1[1]) - Integer.parseInt(date2[1]));
                int dayDiff = Math.abs(Integer.parseInt(date1[0]) - Integer.parseInt(date2[0]));
                
                if (yearDiff > 0) {
                    // 10000
                    hackos += 10000;
                } else if (monthDiff > 0) {
                    //agregamos 500 hackos
                    hackos += monthDiff * 500;
                } else if (Integer.parseInt(date1[0]) > Integer.parseInt(date2[0])) {
                    if (dayDiff > 0) {
                        hackos += dayDiff * 15;
                    }
                }
            }

            System.out.println(hackos);

        } catch (ParseException ex) {
            Logger.getLogger(Hackos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
