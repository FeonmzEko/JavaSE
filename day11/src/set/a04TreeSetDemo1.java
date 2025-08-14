package set;

import java.util.TreeSet;

public class a04TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(777);
        ts.add(55);

        for(Integer v : ts){
            System.out.println(v);
        }

        ts.forEach(s -> System.out.println(s));
    }
}
