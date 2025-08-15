package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class A04_Demo4 {
    public static void main(String[] args) {
        File f = new File("D:\\anzhuang\\D\\qB");

        File[] files = f.listFiles();
        //System.out.println(Arrays.toString(File.listRoots()));

        /*for (File file : files) {
            System.out.println(file);
        }*/

        /*String[] list = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir,name);
                return src.isFile() && name.endsWith("txt");
            }
        });*/

        String[] list = f.list((dir,name)->{
            File src = new File(dir,name);
            return src.isFile() && name.endsWith("txt");
        });

        for (String s : list) {
            System.out.println(s);
        }
    }

}
