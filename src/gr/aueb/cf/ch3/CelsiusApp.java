package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Μετατρέπει θερμοκρασίες Fahrenheit
 * se Celsius
 */
public class CelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        System.out.println("Please provide temp in fahrenheit");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit -32) / 9;

        System.out.printf("%d\u00B0F = %d\u00B0C", fahrenheit, celsius);
    }



}
