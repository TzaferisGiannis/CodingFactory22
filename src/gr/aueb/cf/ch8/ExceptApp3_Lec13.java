package gr.aueb.cf.ch8;

//import java.io.IOException;

import java.io.IOException;

/**
 * Demostrates the usage of Exeptions (δευτερός τρόπος)
 */
public class ExceptApp3_Lec13 {

    public static void main(String[] args) {
       int ch;

        try  {
           ch = getNextChar();
       } catch (IOException e){
            System.out.println("Error in I/O");
        }
    }

    public static int getNextChar() throws IOException {
        int ch = ' ';
        try {
            ch = System.in.read();
        } catch (IOException ex) {
            // 1. Rollback
            // 2. Logging
            ex.printStackTrace();

            // Rethrow
        }
        return ch;
    }
}