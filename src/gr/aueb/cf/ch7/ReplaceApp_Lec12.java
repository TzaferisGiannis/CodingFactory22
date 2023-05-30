package gr.aueb.cf.ch7;

/**
 * Replaces a string
 */
public class ReplaceApp_Lec12 {

    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace(" ", "-");
        System.out.println(dashedTitle);
    }
}
