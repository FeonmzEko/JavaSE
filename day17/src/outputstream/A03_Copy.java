package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03_Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\qB\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\anzhuang\\D\\qB\\b.txt");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
