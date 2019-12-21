/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.hackerrank;

/**
 *
 * @author joselanza
 */
import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] grades) {
        super(firstName, lastName, identification);
        this.testScores = grades;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        int grade = 0;
        for (int i = 0; i < testScores.length; i++) {
            grade += testScores[i];
        }

        grade = grade / testScores.length;

        if (grade >= 90 && grade <= 100) {
            return "O";
        }

        if (grade >= 80 & grade < 90) {
            return "E";
        }

        if (grade >= 70 & grade < 80) {
            return "A";
        }

        if (grade >= 55 & grade < 70) {
            return "P";
        }

        if (grade >= 40 & grade < 55) {
            return "D";
        }

        return "T";

    }
}

class JavaHeritances {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
