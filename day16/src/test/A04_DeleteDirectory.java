package test;

import java.io.File;

public class A04_DeleteDirectory {
    public static void main(String[] args) {
        File f = new File("D:\\anzhuang\\D\\qB");

        delete(f);
    }

    public static void delete(File f){
        if(f == null || !f.exists()){
            return;
        }

        File[] files = f.listFiles();

        if(files == null){
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }

            if(file.isDirectory()){
                delete(file);
            }
        }

        f.delete();
    }
}
