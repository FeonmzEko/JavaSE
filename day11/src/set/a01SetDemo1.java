package set;

import java.util.HashSet;
import java.util.Set;

public class a01SetDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("李四");


        //System.out.println(s);

//        Iterator<String> it = s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        for (var string : s) {
//            System.out.println(string);
//        }

        s.forEach(str -> System.out.println(str));

    }
}
