package zipstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class A03_Directory {
    public static void main(String[] args) {
        File src = new File("D:\\anzhuang\\D\\movie");
        File dest = new File("D:\\anzhuang\\D\\movie.zip");
    }

    public static void copyZip(File src,File dest) throws FileNotFoundException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

    }
}
