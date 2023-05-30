package gr.aueb.cf.myTests;

import java.util.Scanner;

public class PowerAppTestMethods {

    public static void main(String[] args) {
        int a =0;
        int b = 0;
        int result=1;

        Scanner in = new Scanner(System.in);

        System.out.println("please insert a , b");
        a = in.nextInt();
        b = in.nextInt();

        result = pow(a , b);

        System.out.println("a ^ b = " + result);

    }

    public static int pow ( int a, int b) {

        int result = 1;
        for (int i = 1; i <= b; i++){
            result = result * a;
        }return result;
    }
}
