package object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class A02_WriteServalObject {
    public static void main(String[] args) throws IOException {
        // 序列化多个对象
        Student s1 = new Student("zhangSan",23,"南京");
        Student s2 = new Student("LiSi",21,"北京");
        Student s3 = new Student("WangZhe",22,"江苏");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day19\\a.txt"));

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);

        oos.writeObject(list);

        oos.close();
    }
}
