package set;

import java.util.LinkedHashSet;

public class a03LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);
        Student s3 = new Student("xiaohong",19);

        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}
