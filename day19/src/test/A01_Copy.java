package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A01_Copy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        method1();

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\xuniji\\zh-cn_windows_10_consumer_editions_version_22h2_updated_june_2025_x64_dvd_aace2d00.iso");
        FileOutputStream fos = new FileOutputStream("D:\\anzhuang\\D\\xuniji\\1.iso");

        int len;
        byte[] bytes = new byte[8192];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }
}
