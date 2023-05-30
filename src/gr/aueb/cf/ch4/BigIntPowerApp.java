package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει την α^ν με BigInteger
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");

        System.out.println("please insert two ints , base and prower");
        Scanner in = new Scanner(System.in);
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);

        }
        System.out.printf("%d^%d = %,d" , a , n, result);
    }
}
