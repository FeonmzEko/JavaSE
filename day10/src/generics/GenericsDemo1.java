package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(1);
        list.add("aaa");
        list.add(new Student(19,"zhangsan"));
        System.out.println(list);

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
