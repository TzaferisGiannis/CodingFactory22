package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRowDataApp_lec15 {


    public static void main(String[] args) {
        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];

        try (FileInputStream in = new FileInputStream("c:/tmp/v1.mp4");
        FileOutputStream out = new FileOutputStream("C:/tmp/v1out.mp4") ){
            while ((b = in.read()) != -1) {
                out.write(buffer, 0 , b);
                count++;
            }

        }catch (IOException e) {
            throw new RuntimeException();
        }
    }


}

