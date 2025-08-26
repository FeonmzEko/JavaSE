package zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class A04_ZipStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 把文件夹压缩为压缩包
        File src  = new File("D:\\aaa");
        File dest = new File(src.getParent(),src.getName() + ".zip");

        // 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(src));

        toZip(src,zos,"");

        zos.close();
    }
    public static void toZip(File src,ZipOutputStream zos,String name){
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                ZipEntry entry = new ZipEntry("???");
                System.out.println(file.toString());

            }else if(file.isDirectory()){
                //toZip(file,zos,);
            }
        }

    }
}
