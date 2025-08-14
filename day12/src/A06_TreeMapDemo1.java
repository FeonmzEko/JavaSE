import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class A06_TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println(tm);
    }
}