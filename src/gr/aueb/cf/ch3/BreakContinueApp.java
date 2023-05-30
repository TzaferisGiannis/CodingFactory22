package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break kai
 * continue
 */
public class BreakContinueApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("please provide a num");
            num = in.nextInt();
// δεν θέλουμε το 5 να είναι μέσα στο sum για αυτό βάλαμε continue το αγνωεί
            if (num == 5) {
                continue;
            }

            sum += num;
            if (num == 10) {
                System.out.println("Bingo!!!");
                // ψάχνω κάτι και μόλις το βρώ θέλω να κάνω break
                break;
            }
        }
        System.out.println("sum: " + sum);
    }
}
