package set;

import java.util.TreeSet;

public class a04TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",77);
        Student s2 = new Student("zhang",67);
        Student s3 = new Student("san",17);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}