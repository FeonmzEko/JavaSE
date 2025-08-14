package myfuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌，15","张三，6");

        /*List<Student> students = list.stream()
                .map(s -> new Student(s.split("，")[0], Integer.parseInt(s.split("，")[1])))
                .collect(Collectors.toList());*/

        list.stream().map(Student::new).toList();
    }
}
