import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();

        mp.put("1","2");
        mp.put("2","3");
        mp.put("4","5");

        mp.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " = " + s2);
            }
        });

        mp.forEach((key,value)->{
            System.out.println(key + " = " + value);
        });

        System.out.println(mp);
    }
}
