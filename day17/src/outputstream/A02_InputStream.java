package outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A02_InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\qB\\a.txt");

        int b1;
        while((b1 = fis.read())  != -1){
            System.out.println((char)b1);
        }


        fis.close();

    }
}
