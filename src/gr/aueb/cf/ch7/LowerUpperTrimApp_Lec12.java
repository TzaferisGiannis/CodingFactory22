package gr.aueb.cf.ch7;


/**
 * Transforms strings.
 */
public class LowerUpperTrimApp_Lec12 {

    public static void main(String[] args) {
        String s = "Athens Uni";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = ""; // δεν είναι null εχει length 0

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }

        if (s2.isBlank()){
            System.out.println("Blank");
        }
    }
}