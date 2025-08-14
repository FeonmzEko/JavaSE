import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();

        mp.put("1","2");
        mp.put("2","3");
        mp.put("4","5");

        Set<String> keys = mp.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = mp.get(key);
            System.out.println(key + " = " + value);
        }

        for(String key:keys){
            String value = mp.get(key);
            System.out.println(key + " = " + value);
        }

        keys.forEach(key->{
            System.out.println(key);
            System.out.println(mp.get(key));
        });

        System.out.println(mp);
    }
}
