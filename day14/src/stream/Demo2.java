package stream;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","4","6");

        list.stream().forEach(str-> System.out.println(str));
    }
}
