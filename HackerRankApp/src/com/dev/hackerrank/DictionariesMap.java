/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author joselanza
 */
public class DictionariesMap {
    
    public static HashMap<String,Integer> phonelist = new HashMap<>();
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonelist.put(name, phone) ;
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            boolean contains= phonelist.containsKey(s);
            if (contains) {
                Integer i = phonelist.get(s);
                System.out.printf("%s=%d\n",s, i );
            }else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
