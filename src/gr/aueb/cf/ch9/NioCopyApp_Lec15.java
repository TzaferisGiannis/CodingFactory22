package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp_Lec15 {

    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("c:/tmp.v1.mp4");
        Path targetPath = Paths.get("C:/tmp/v3out.mp4");

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
