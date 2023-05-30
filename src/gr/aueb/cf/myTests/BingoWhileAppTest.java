package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * bingo while --- diko mou test
 */
public class BingoWhileAppTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int key = 50;


        do {
            System.out.println("please insert a number" );
            n = in.nextInt();

            if (n == key){

                System.out.println("Bingo! you have found the key");
            } else {

                System.out.println("please try again");
            }
    } while   ( n != key);
}}
