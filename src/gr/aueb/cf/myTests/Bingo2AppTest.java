package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * bingo if the user find the key
 */
public class Bingo2AppTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
        System.out.println("Please insert a number : ");
        inputNum = in.nextInt();


        if (inputNum == key) {
            bingo = true;
            System.out.println("Bingo!!!");
        } else {
            System.out.println("Try Again");
        }
        } while (!bingo);
    }
}

