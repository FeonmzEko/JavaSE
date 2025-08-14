package test;

import java.util.HashMap;

public class TestDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();

        Student s1 = new Student("angel",23);
        Student s2 = new Student("huier",22);
        Student s3 = new Student("azou",19);

        map.put(s1,"Henan");
        map.put(s2,"LianCang");
        map.put(s3,"beihaiDao");

        map.forEach((key,value)->{
            System.out.println(key + "居住在" + value);
        });
    }
}
