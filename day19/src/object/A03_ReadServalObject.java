package object;

import java.io.*;
import java.util.ArrayList;

public class A03_ReadServalObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day19\\a.txt"));

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        list.forEach(s-> System.out.println(s));

        ois.close();
    }
}
