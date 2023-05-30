package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConcatApp_Lec12 {

    public static void main(String[] args) {
        String title ="Dr.";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullname;
        String titledFullName;

        fullname = title + firstname + lastname; // στην java έστω και ένα string να υπάρχει σε μία παράσταση, μετατρέπονται όλα σε string
        titledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullname);
        System.out.println(titledFullName);
    }
}
