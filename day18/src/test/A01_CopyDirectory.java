package test;

import java.io.*;

public class A01_CopyDirectory {

    public static void main(String[] args) throws IOException {
        File qB = new File("D:\\anzhuang\\D\\qB");
        File movie = new File("D:\\anzhuang\\D\\movie");

        copyDir(qB,movie);
    }

    private static void copyDir(File qB, File movie) throws IOException {
        if (!movie.exists()) {
            movie.mkdirs();
        }


        if(qB == null || movie == null){
            return;
        }

        File[] files = qB.listFiles();

        if(files == null){
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis  = new FileInputStream(file);
                FileOutputStream fos  = new FileOutputStream(new File(movie,file.getName()));
                byte[] bytes = new byte[1024];

                int len;
                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }

                fos.close();
                fis.close();
            }else{
                copyDir(file,new File(movie,file.getName()));
            }
        }
    }
}
