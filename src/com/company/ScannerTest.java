package com.company;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name =  input.nextLine();
        System.out.println("Hello "+name+", nice to meet you!");
        Scanner age = new Scanner(System.in);
        System.out.println("What is your age "+name+"?");
        int ansAge = age.nextInt();
        System.out.println("your age is "+ansAge+".");

    }
}
