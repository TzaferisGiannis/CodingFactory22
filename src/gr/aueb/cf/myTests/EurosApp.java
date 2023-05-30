package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * converts euros to 500euros, 100euros, 50euros, 20euros, 10euros, 5euros, 2euros, 1euro
 */
public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEuros = 0;
        int remainingEuros =0;
        int euros500, euros200, euros100, euros50, euros20, euros10, euros5, euros2, euros1, cents;

        System.out.println("please insert total euros");
        totalEuros = in.nextInt();

        euros500 = totalEuros / 500;
        remainingEuros = totalEuros % 500;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros =remainingEuros % 5;

        euros2 = remainingEuros /2;
        remainingEuros = remainingEuros % 2;

        euros1 = remainingEuros / 1;
        cents = remainingEuros % 1;



        System.out.printf("τα %d = %d 500euros + %d 100euros + %d 50 euros + %d 20 euros + %d 10euros + %d 5euros + %d 2euros + %d 1euros + %d cents",totalEuros, euros500, euros100,
                euros50, euros20, euros10, euros5, euros2, euros1, cents);
    }
}
