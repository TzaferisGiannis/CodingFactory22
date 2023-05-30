package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class OWriterApp_Lec14 {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")){
            ps.println("Hello CF! from print screen");
            pw.println("Hello cf! from print writer");

        }catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
