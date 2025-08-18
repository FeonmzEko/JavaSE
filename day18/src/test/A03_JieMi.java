package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03_JieMi {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\qB\\b.txt");
        FileOutputStream fos  = new FileOutputStream("D:\\anzhuang\\D\\qB\\c.txt");

        int b;
        while (((b = fis.read()))!=-1){
            fos.write(b^66);
        }

        fis.close();
        fos.close();
    }
}