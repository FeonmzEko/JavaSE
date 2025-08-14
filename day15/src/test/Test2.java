package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,new Student("张三",11),new Student("李四",20));

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }
}
