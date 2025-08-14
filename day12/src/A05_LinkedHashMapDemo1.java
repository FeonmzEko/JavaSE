import java.util.LinkedHashMap;

public class A05_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("a",1);
        lhm.put("b",5);
        lhm.put("t",15);

        System.out.println(lhm);
    }
}