package gr.aueb.cf.myTests;

import java.util.Scanner;

/**
 * input of sum of grades and number of lessons
 * output average grade and success grade
 */
public class NestedIfAppTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumOfGrades = 0;
        int numberOfModules = 0;
        int average = 0;

        do {
        System.out.println("please insert sum of grades");
        sumOfGrades = in.nextInt();

        System.out.println("please insert number of lessons");
        numberOfModules = in.nextInt();

        if (sumOfGrades != 0) {
            average = sumOfGrades / numberOfModules;
            if ((average >= 9) && (average <= 10)) {
                System.out.println("excellent");
            } else if ((average >= 7) && (average <= 8)) {
                System.out.println("very good");
            } else if ((average >= 5) && (average <= 7)) {
                System.out.println("good");

            } else if (average < 5){
                System.out.println("fail");}
                    else {

                System.out.println("modules can not be zero");
            }
        }
    } while (average < 0);
}
}
