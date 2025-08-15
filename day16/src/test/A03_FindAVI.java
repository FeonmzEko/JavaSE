package test;

import java.io.File;
import java.util.Arrays;

public class A03_FindAVI {
    public static void main(String[] args) {
        File f = new File("C:\\");

        findAVI(f);

    }

    public static void findAVI(File f){
        if(f == null || !f.exists()){
            return;
        }

        File[] files = f.listFiles();
        if(files == null){
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                if(file.getName().endsWith(".flac")){
                    System.out.println(file);
                }
            }
            if(file.isDirectory()){
                findAVI(file);
            }
        }
    }
}
