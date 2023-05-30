package gr.aueb.cf.ch6ArraysTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayPopulateFileTest {

    public static void main(String[] args) throws FileNotFoundException {
        int [] ages = new int[5];
        File intFile = new File("D:/tmp/intfile.txt");
        Scanner in = new Scanner(intFile);

        for (int i = 0; i < ages.length; i++){
            ages[i] = in.nextInt();
        }

        for (int age : ages) {
            System.out.println(age + " ");
        }
    }
}
