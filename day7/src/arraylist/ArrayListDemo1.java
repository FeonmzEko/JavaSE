package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.remove("aaa");

        list.remove(0);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
