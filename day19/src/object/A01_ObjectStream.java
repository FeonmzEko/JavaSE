package object;

import java.io.*;

public class A01_ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\anzhuang\\D\\xuniji\\a.txt"));

        Student stu = (Student)(ois.readObject());

        System.out.println(stu);
    }
}
