package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και μέγιστο
 * στοιχείο ενός πίνακα
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {

        int[] arr = {30, 12, 80, 7, 15};
        int[] arr2 = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        // Min

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        // Max

        for (int i = 1; i < arr.length; i++) {
            if (arr2[i] < maxValue) {
                maxPosition = i;
                maxValue = arr2[i];
            }
        }
        System.out.printf("Min value : %d , Min Position", minValue, minPosition + 1); // βάζω στο minPosition + 1 διότι αρχίζει να μετράει από το μηδεν οπότε γίνεται πιο userfriendly
        System.out.printf("Max value : %d , Max Position", maxValue, maxPosition + 1);
    }
}
