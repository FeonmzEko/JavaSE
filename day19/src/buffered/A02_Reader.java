package buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A02_Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\anzhuang\\D\\qB\\a.txt"));

        String s ;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }


        br.close();
    }
}