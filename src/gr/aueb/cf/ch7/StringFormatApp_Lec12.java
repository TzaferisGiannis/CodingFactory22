package gr.aueb.cf.ch7;

/**
 * Formats to string.
 */
public class StringFormatApp_Lec12 {

    public static void main(String[] args) {
        char row = 'B';
        int col = 10;

        String seat = String.format("%c%02d", row, col);

        System.out.println(seat);
    }
}
