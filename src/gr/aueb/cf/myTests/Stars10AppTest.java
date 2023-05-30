package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * prints the number of stars that the user enters
 */
public class Stars10AppTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int starsNumber = 0;


        System.out.println("Please insert the number of stars (int): ");
        n = in.nextInt();

        while (i <= n){
            System.out.print("*");
            i=i+2;
            starsNumber++;
        }
        System.out.println("the number of stars is :" + starsNumber);

    }
}
