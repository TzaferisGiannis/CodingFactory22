package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Array Populate from file.
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:/tmp/intfile.txt");
        Scanner in = new Scanner(file); // οταν κοκκινιζει επιλεγω add exception
        int[] grades = new int[5];

        for (int i = 0 ; i < grades.length; i++){
            grades[i] = in.nextInt();
        }
        for (int grade : grades) {              //enhanced for
            System.out.printf(grade + " ");
       }
    }
}