package test;

import java.io.File;
import java.io.IOException;

public class A02_Create {
    public static void main(String[] args) {
        String str = "D:\\anzhuang\\D\\qB\\aaa\\a.txt";
        File f = new File(str);
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
