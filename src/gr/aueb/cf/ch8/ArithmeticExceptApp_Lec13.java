package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp_Lec13 {
/**
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int result;

        try {
            result = num1 / num2;
        } catch (ArithmeticException e){
            e.printStackTrace(); // το try catch εδώ είναι λάθος γιατί αποκρύπτουμε το λάθος
        }
//        System.out.println(result);
    }
}
*/

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num1;
    int num2;
    int result;

    System.out.println("please insert");
    num1 = in.nextInt();
    num2 = in.nextInt();

    try {
        result = num1 / num2;
    } catch (ArithmeticException E){
        System.out.println("please ..."); // έχει συνέχεια να δώ το βιντεο
    }
    }
}