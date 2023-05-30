package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * do while menu test --- diko mou test
 */
public class MenuAppTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. insert product");
            System.out.println("2. delete product");
            System.out.println("3. exit");
            choice = in.nextInt();
        } while ( choice !=3);

        System.out.println("thank you for using our app!");
    }

    /**
     * counts and sums positives --- diko moy test
     */
    public static class PositivesCountTest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int i = 0;
            int countPositives = 0;
            int sumPositives = 0;

            System.out.println("please insert an positive number or a negative for stop");
            i = in.nextInt();

            while (i >= 0) {
                System.out.println("please insert an other number");
                countPositives++;
                sumPositives = sumPositives + i;
                i = in.nextInt();
                }
            System.out.println("you inserted a negative number");
            System.out.println("The numper of positives is:" + countPositives + "  and the sum of positives is :" +sumPositives);
            }

        }
}
