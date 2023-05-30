package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένα έτος είναι δίσεκτο (Leap Year)
 * όπου δίσεκτο σημαίνει να το έτος να διαιρείται με το 4,
 * να μην διαιρειται με το 100, και να διαιρείται με το 100
 * va διαρειται και με το 400
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeap = false;

        System.out.println("Please insert year: ");
        year = in.nextInt();

        isLeap = year % 4 ==0 && (year % 100 != 0 || year % 400 == 0 );

        if (year % 4 == 0 ) {
            if (year % 100 != 0 ) {
                isLeap = true;
            } else if ( year % 400 == 0){
                isLeap = true;
            }
        }
    }
}
