package gr.aueb.cf.ch6ArraysTest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPopulatedKeyboardTest {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("please insert a number for the position : " + ( i + 1 ));

            arr[i] =in.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
