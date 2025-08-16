package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A01_Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\anzhuang\\D\\qB\\a.txt",true);

        byte[] b = {97,98,99,100,101};
        fos.write(b);

        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        fos.close();

    }
}
