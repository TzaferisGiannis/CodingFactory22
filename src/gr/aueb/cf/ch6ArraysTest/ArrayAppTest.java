package gr.aueb.cf.ch6ArraysTest;

/**
 * Δήλωση πίνακα 3 θέσεων και εκτύπωση
 */
public class ArrayAppTest {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 8;

        System.out.println("the array is  " + arr[0] + " , " + arr[1] + " ," + arr[2]);
    }
}