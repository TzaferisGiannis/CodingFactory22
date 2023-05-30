package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExcept2App_Lec13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;


        System.out.println("Please insert an int");
        inputStr = in.nextLine();
        if (isInt(inputStr)) {
            inputNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inputNum);
            System.out.println("Error in input");
        }
}
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
