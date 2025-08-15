package file;

import java.io.File;
import java.io.IOException;

public class A02_Demo2 {
    public static void main(String[] args) {
        String str = "D:\\anzhuang\\D\\qB\\a.txt";
        File f1 = new File(str);

        boolean b = f1.delete();
        System.out.println(b);




    }

}
