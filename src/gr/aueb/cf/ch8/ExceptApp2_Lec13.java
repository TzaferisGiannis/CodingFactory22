package gr.aueb.cf.ch8;

//import java.io.IOException;

import java.io.IOException;

/**
 * Demostrates the usage of Exeptions (δευτερός τρόπος)
 */
public class ExceptApp2_Lec13 {
    public static void main(String[] args) {
        try {


            int ch = System.in.read();
        } catch (IOException ex) {
            // StrErr
            ex.printStackTrace();
        }
    }


}