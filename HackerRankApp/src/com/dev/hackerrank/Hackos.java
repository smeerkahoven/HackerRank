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
    
    public static void main(String [] args){
        String line1  = scanner.nextLine();
        String line2  = scanner.nextLine();
        
        line1 = line1.replace(" ", "/") ;
        line2 = line2.replace(" ", "/") ;
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d1 = format.parse(line1);
            Date d2 = format.parse(line2);
            
            long diff = Math.abs( d1.getTime() - d2.getTime()) ;
            long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) ;
            
            System.out.println(days*15);
            
        } catch (ParseException ex) {
            Logger.getLogger(Hackos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
