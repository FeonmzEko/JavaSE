package fileutils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class A01_FileUtilsDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("day21\\aaa");
        File dest = new File("day21\\copy");
        FileUtils.copyDirectoryToDirectory(src,dest);

        FileUtils.deleteDirectory(src);
        FileUtils.cleanDirectory(dest);
    }
}
