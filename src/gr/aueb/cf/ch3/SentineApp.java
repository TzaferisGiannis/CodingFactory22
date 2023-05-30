package gr.aueb.cf.ch3;

/**
 * keep reading until a sentinel
 * value is provided
 */

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class SentineApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a num");
        num = in.nextInt();

        while (num != 0 ) {
         //System.out.println(num);
            iterations++;
            System.out.println("please provide a num");
            num = in.nextInt();
        }

    }
}
