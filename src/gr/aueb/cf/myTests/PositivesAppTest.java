package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * counts the number of positives inserted by the user
 */
public class PositivesAppTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please insert a number (int): " );
        num = in.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please insert a positive or negative for exit");
            num = in.nextInt();
        }
        System.out.println("you inserted a negative");
        System.out.println("the number of positives is: " +positivesCount);
    }
}
