/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank.java;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author joselanza
 */
public class SortHash {
        static class MyBigDecimal{

        private BigDecimal value ;
        private String key ;
        
        public void setValue(BigDecimal value) {
            this.value = value ;
        }

        public BigDecimal getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
        
        public MyBigDecimal(String key, BigDecimal value) {
            this.value = value ;
            this.key = key ;
        }

        @Override
        public String toString() {
            return this.key + "=" + this.value.toString() ;
        }
        
    }
    
    static class MyComparator implements Comparator<MyBigDecimal>{

        @Override
        public int compare(MyBigDecimal o1, MyBigDecimal o2) {
            return o1.getValue().doubleValue() < o2.getValue().doubleValue() ? 1 : -1 ;
        }
        
    }
    

    public static void main(String[] args) {

        LinkedList<MyBigDecimal> map = new LinkedList<>();
        
        map.add(new MyBigDecimal( "9", ( new BigDecimal(9).setScale(2, BigDecimal.ROUND_HALF_UP))));
        map.add(new MyBigDecimal("-100", new BigDecimal(-100).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("50", new BigDecimal(50).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("0", new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("56.6", new BigDecimal(56.6).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("90", new BigDecimal(90).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("0.12", new BigDecimal(0.12).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal(".12", new BigDecimal(0.12).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("02.34", new BigDecimal(2.34).setScale(2, BigDecimal.ROUND_HALF_UP)));
        map.add(new MyBigDecimal("000.000", new BigDecimal(0.0).setScale(2, BigDecimal.ROUND_HALF_UP)));

     
        Collections.sort(map, new MyComparator());
        
        map.forEach(System.out::println);
        
        
    }
}
