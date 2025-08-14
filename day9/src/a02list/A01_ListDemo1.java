package a02list;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("111");
        list.add("jpg");
        list.add("pop");

        list.add(0,"000");
        String delete = list.remove(1);

        System.out.println(delete);
        System.out.println(list.get(2));

        System.out.println(list);
    }
}
