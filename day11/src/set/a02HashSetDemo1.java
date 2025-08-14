package set;

import java.util.HashSet;

public class a02HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhuusan",18);
        Student s3 = new Student("xiaohong",19);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);
    }
}
