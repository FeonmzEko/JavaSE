package object;

import java.io.*;

public class A00_ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\anzhuang\\D\\xuniji\\a.txt"));

        Student stu = new Student("zhang",23,"Henan");

        oos.writeObject(stu);
    }
}
