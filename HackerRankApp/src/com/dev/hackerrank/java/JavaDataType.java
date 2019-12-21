/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class JavaDataType {
    
     public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                
                long min_ = -9223372036854775808l;
                long max_ =  9223372036854775807l;
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=min_ && x<=max_)System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
    
}
