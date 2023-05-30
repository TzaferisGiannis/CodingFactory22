package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανίζει ένα μενού και ο χρήστης
 * δίνει μία επιλογή και λαμβάνει ένα
 * αντίστοιχο feedback/confirmation.
 */
public class MenuChoiceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωνή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if ( choice < 1 || choice > 5 ){
                System.out.println("Mη έγγυρη επιλογή");
                continue;
            }

            if ( choice == 5) {
                System.out.println("Επιλέξατε έξοδο");
            }
            if ( choice == 1 ){
                System.out.println("Επιλέξατε εισαγωνή");
                            }
            if ( choice == 2) {
                System.out.println("Έπιλέξατε Ενημέρωση");
            }
            if (choice == 3 ){
                System.out.println("Επιλέξατε Διαγραφή");
            }
            if (choice == 5 ) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
        } while (choice !=5 );
    }
}
