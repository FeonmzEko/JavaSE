package stream;

import java.lang.foreign.ValueLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bb",13);
        hm.put("Angel",23);
        hm.put("Beat",22);
        hm.put("Beat1",22);
        hm.put("Beat2",22);
        hm.put("Beat3",22);
        hm.put("Beat4",22);

        hm.entrySet().stream().forEach(s-> System.out.println(s));

    }
}
