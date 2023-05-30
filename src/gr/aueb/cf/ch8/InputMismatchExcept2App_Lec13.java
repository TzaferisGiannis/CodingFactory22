package gr.aueb.cf.ch8;

/**
 * o χρήστης αντι για num βαλει char -- version 2
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept2App_Lec13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM =12;

        while (true) {

                System.out.println("Please insert a num");

                if (in.hasNextInt()) {
                    inputNum = in.nextInt();
                }else {
                    in.nextLine();
                    System.out.println("Error. Please insert a valid int");
                    continue;
                }
                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great!");
                    break;
                }
           }
        System.out.println("Thank you for using the Magic App");
    }
}
