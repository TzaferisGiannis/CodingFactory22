package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp_Lec13 {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)){
            ch = (char) System.in.read();
        } catch (FileNotFoundException e2){
            System.out.println("File not found Error");
        } catch (IOException e1) {
//            e.printStackTrace();
            System.out.println("Read error");

        } catch (Exception e3){
            System.out.println("Oooopss something went wrong");
        }
    }
}
