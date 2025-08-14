package a01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // lambda表达式
        coll.forEach(s -> System.out.println(s));

        coll.forEach((String s) -> {
            System.out.println(s);
        });
    }
}
