package gr.aueb.cf.myTests;

import java.util.Locale;
import java.util.Scanner;

/**
 * υπολογίζει τα α^ν με math.pow
 */
public class MathPowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("please insert a and n (ints)");
        a = in.nextInt();
        n = in.nextInt();

        System.out.printf(Locale.forLanguageTag("el")," %d ^ %d = %,d" ,a, n , (int) Math.pow( a, n));
    }
}
