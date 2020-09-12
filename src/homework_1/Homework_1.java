/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Homework_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to conventor!");
        System.out.println("This program converts Celsius to Fahrenheit.");
        System.out.println("Enter degrees Celsius: ");
        Scanner scanner = new Scanner(System.in);
        int number_one = scanner.nextInt();
        //System.out.println("Enter second number: ");
        //int number_two = scanner.nextInt();
        int result = (number_one * 9/5) + 32;
        //System.out.print("Fahrenheit result: ");
        System.out.println("Fahrenheit result: " + result);
        System.out.println("The program was made by a student of the JPTVR19 group.");
        System.out.println("Good Bye!!!");
    }
} 
    