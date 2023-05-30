package gr.aueb.cf.ch7;


/**
 * Splits a string.
 */
public class StringSplitApp_Lec12 {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        String [] tokens = s.split(" +");// το + εμφανίζει μόνο ένα κενο αν έχω περισσότερα

        for (String token : tokens ) {
            System.out.println(token);
        }
    }
}
