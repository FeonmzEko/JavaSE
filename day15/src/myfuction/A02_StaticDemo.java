package myfuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A02_StaticDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3");

        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
