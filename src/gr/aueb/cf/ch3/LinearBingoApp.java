package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if - then - else
 */
public class LinearBingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;

        while (true) {
            System.out.println("Please provide a mum");
            num = in.nextInt();

            // ελέγχει αν ο αριθμός που δίνουμε έιναι διαφορετικός του SECRET_KEY. Με αυτό τον τρόπο αποφεύγουμε το else
            // ελέγχω πρώτα το error. ειναι καλυτερο για τον έλεγχο στο testing

            if (num != SECRET_KEY) {
                System.out.println("Please try again!");
                continue;
            }
            System.out.println("Bingo!");
            break;
        }
    }
}
