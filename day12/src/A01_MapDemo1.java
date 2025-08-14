import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();

        mp.put("1","2");
        mp.put("2","3");
        mp.put("4","5");

        mp.remove("1");
        System.out.println(mp.containsKey("1"));
        System.out.println(mp.containsValue("3"));

        System.out.println(mp);
    }
}
