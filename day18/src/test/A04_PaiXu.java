package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class A04_PaiXu {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\anzhuang\\D\\qB\\d.txt");
        FileOutputStream fos = new FileOutputStream("D:\\anzhuang\\D\\qB\\e.txt");

        ArrayList<Integer> list = new ArrayList<>();

        int b;
        while((b = fis.read()) != -1){
            if(b != 45){
                list.add(b - 48);
            }
        }

        //list.sort((o1,o2)->o1 - o2);
        Collections.sort(list);

        /*Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            fos.write(it.next() + 48);
            if(it.hasNext()){
                fos.write(45);
            }
        }*/

        for (int i = 0; i < list.size(); i++) {
            fos.write(list.get(i) + 48);
            if(i < list.size() - 1){
                fos.write(45);
            }
        }

        fis.close();
        fos.close();
    }
}
