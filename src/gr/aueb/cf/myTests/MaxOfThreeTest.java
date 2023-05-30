package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * finds the max of three numbers
 */
public class MaxOfThreeTest {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("max of %d, %d, %d is %d", num1, num2, num3, Math.max( num1, Math.max( num2, num3 )));

    }
}
