package gr.aueb.cf.myTests;

import java.util.Scanner;

public class RightTriangleAppTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("please insert a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs( a * a - b * b - c * c) <= EPSILON);

        System.out.println("The Triangle is right: " + isRight);

    }
}
