package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * finds min num
 */
public class MinAppTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();


//        if (num1 > num2) {
//            min = num2;
//            System.out.println("min =" +num2);
//            } else {
//            min = num1;
//            System.out.println("min = " +num1);
//        }
        min = (num1 > num2 ) ? num2 : num1;

        System.out.printf("the min value between %d and %d is %d", num1, num2, min);
    }
}
