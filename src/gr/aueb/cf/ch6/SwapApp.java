package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        swap(arr);

        for (int item :arr){
            System.out.print(item + " ");
        }

        swap(arr);
        System.out.println();

        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

    public static void swap(int[] arr){
        if (arr == null  || arr.length !=2) return; // Το return στην void λειτουργεί σαν break αν δηλαδή έχουμε κενό πίνακα σταματαει το πρόγραμμα

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
