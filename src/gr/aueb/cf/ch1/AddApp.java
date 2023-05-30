package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους
 * και εμβανιζει το αποτέλεσμα
 * στο stdout.
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών, οι δηλώσεις γίνονται πάντα στην αρχή
        int num1=10;
        int num2=7;
        int result=0;

        //Εντολές - αφήνω κενό ανάμεσα στους τελεστές για λόγους αναγνωσιμότητας (readability)
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων - δύο τρόποι
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println ("Το αποτέλεσμα των " + num1 + "," + num2 + " είναι " + result);

        // με την printf συνεννονουμέ πολλά στοιχεία
        System.out.printf("Το αποτέλεσμα των %d, %d είναι %d" , num1, num2, result);

    }
}
