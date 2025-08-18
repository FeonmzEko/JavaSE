package unicode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A02_Read {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("D:\\anzhuang\\D\\qB\\b.txt");

        int b;

        while((b = f.read()) != -1){
            System.out.print((char)b);
        }

        f.close();

    }
}
