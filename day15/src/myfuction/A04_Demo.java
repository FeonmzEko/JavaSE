package myfuction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class A04_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
