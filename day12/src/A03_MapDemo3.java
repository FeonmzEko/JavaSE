import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();

        mp.put("1","2");
        mp.put("2","3");
        mp.put("4","5");

        Set<Map.Entry<String,String>> entries = mp.entrySet();
        for (var entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        Iterator<Map.Entry<String,String>> it = entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        entries.forEach(s -> System.out.println(s) );

        System.out.println(mp);
    }
}
