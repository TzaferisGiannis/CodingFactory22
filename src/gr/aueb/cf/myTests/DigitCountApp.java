package gr.aueb.cf.myTests;


import java.util.Scanner;

/**
 * counts the number of digits of an int
 */
public class DigitCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count=0;
        int sum = 0;

        System.out.println("Please insert a number");
        inputNum = in.nextInt();
        num = inputNum;

        do{
            count++;
            num = num/10;
        } while (num !=0);
        System.out.printf(" then number %d consists of %d digits the sum of which is %d " , inputNum , count );
    }
}
