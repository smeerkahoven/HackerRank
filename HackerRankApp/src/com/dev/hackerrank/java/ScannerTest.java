/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joselanza
 */
public class ScannerTest {
    
    static class BigDecimalComparator implements Comparable<BigDecimalComparator>{

        private BigDecimal value ;
        private String key ;
        
        public void setValue(BigDecimal value) {
            this.value = value ;
        }

        public BigDecimal getValue() {
            return value;
        }
        
        
        @Override
        public int compareTo(BigDecimalComparator o) {
            return value.doubleValue() > o.getValue().doubleValue() ? 1 :0 ;
        }
        
        public BigDecimalComparator(BigDecimal value) {
            this.value = value ;
        }

        
    }

    public static void main(String[] args) {

        HashMap<String, BigDecimal> map = new HashMap<>();
        
        map.put("9", ( new BigDecimal("9").setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.put("-100", new BigDecimal(-100).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("50", new BigDecimal(50).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("0", new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("56.6", new BigDecimal(56.6).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("90", new BigDecimal(90).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("0.12", new BigDecimal(0.12).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put(".12", new BigDecimal(0.12).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("02.34", new BigDecimal(2.34).setScale(2, BigDecimal.ROUND_HALF_UP));
        map.put("000.000", new BigDecimal(0.0).setScale(2, BigDecimal.ROUND_HALF_UP));

        /*
        map.entrySet().forEach(
            System.out::println
        );*/
        
        ArrayList<String> a = new ArrayList<>();
        
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e-> {
                    a.add(e.getKey());
                });
        
        
        for (int i= a.size()-1 ; i>-1 ; i--){
            System.out.println(a.get(i));
        }
    }

}
