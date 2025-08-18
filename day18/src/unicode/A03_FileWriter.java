package unicode;

import java.io.FileWriter;
import java.io.IOException;

public class A03_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("D:\\anzhuang\\D\\qB\\b.txt");

        for(int i = 0;i < 8192;i++){
            f.write(97);
        }


        f.close();
    }
}