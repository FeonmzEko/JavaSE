package set;

import java.util.Comparator;
import java.util.TreeSet;

public class a04TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                // 按照长度排序
                int i = o1.length() - o2.length();
                // 如果一样长则按照首字母排序
                i = (i == 0 ? o1.compareTo(o2):i);
                return i;
            }
        });

        TreeSet<String> Ts = new TreeSet<>((o1,o2)-> {
            // 按照长度排序
            int i = o1.length() - o2.length();
            // 如果一样长则按照首字母排序
            i = (i == 0 ? o1.compareTo(o2) : i);
            return i;
        });

        System.out.println(ts);
    }
}