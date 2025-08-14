package a02list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class A04_ListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("111");
        list.add("171");
        list.add("141");

        Iterator<String> it =list.iterator();

        list.remove(1);

        System.out.println(it.next());
    }
}
