package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A04_ReadArray {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\qB\\b.txt");

        byte[] by = new byte[2];

        fis.read(by);
        System.out.println(new String(by));

        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }
}
