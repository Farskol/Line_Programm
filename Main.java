package com.company;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write a:");
	double a = console.nextDouble();
        System.out.println("Write b:");
	double b = console.nextDouble();
        System.out.println("Write c:");
	double c = console.nextDouble();
	double sum = ((a - 3)*(b/2))+c;
	System.out.println(sum);
    }
}
