package zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class A02_ZipStream2 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\anzhuang\\D\\movie\\b.txt");

        File dest = new File("D:\\anzhuang\\D\\movie");
        toZip(src,dest);
    }
    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"b.zip")));

        ZipEntry entry = new ZipEntry("b.txt");
        zos.putNextEntry(entry);

        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
