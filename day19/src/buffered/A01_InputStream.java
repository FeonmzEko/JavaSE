package buffered;

import java.io.*;

public class A01_InputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\anzhuang\\D\\qB\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\anzhuang\\D\\qB\\b.txt"));

        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }

        bis.close();
        bos.close();
    }
}
