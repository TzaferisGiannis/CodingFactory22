package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * reads start , end value and step and counts steps
 */
public class ForFlexAppTest {

    public static void main(String[] args) {
        int startValue = 0;
        int endValue = 0 ;
        int step = 0;
        int interations = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("please insert start, end , steps (int)");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            interations++;
        }
        System.out.println();
        System.out.println("interations = " +interations);
    }
}
