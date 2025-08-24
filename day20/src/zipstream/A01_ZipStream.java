package zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class A01_ZipStream {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\anzhuang\\D\\movie\\movie.zip");

        File dest = new File("D:\\anzhuang\\D\\qB\\");

        unzip(src,dest);

    }

    public static void unzip(File src,File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while((entry = zip.getNextEntry()) != null){
            System.out.println(entry);
            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
            }
        }
    }
}
