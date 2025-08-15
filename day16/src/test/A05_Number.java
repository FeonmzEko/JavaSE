package test;

import java.io.File;

public class A05_Number {
    static int number_jar = 0;
    static int number_exe = 0;
    static int number_zip = 0;
    public static void main(String[] args) {
        File f = new File("D:\\");
        numberCount(f);

        System.out.println("jar: " + number_jar);
        System.out.println("exe: " + number_exe);
        System.out.println("zip: " + number_zip);

    }

    public static void numberCount(File f){
        if(f == null || !f.exists()){
            return;
        }

        File[] files = f.listFiles();

        if(files == null){
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                if(file.getName().endsWith(".jar")){
                    number_jar++;
                }else if(file.getName().endsWith(".exe")){
                    number_exe++;
                }else if(file.getName().endsWith(".zip")){
                    number_zip++;
                }
            }
            if(file.isDirectory()){
                numberCount(file);
            }
        }
    }
}
