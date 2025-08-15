package file;

import java.io.File;
import java.io.IOException;

public class A03_Demo3 {
    public static void main(String[] args) {
        File f = new File("D:\\anzhuang\\D\\qB");

        File[] files = f.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

}
