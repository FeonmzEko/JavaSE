package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city1,"南京市","苏州市","无锡市","常州市");
        Collections.addAll(city2,"武汉市","孝感市","宜昌市","鄂州市");
        Collections.addAll(city3,"石家庄市","唐山市","保定市","张家口市");

        hm.put("江苏省",city1);
        hm.put("武汉省",city2);
        hm.put("河北省",city3);

        hm.forEach((s,list)-> {
            System.out.print(s + " = ");
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
                if(it.hasNext()){
                    System.out.print(",");
                }
            }
            System.out.println();
        });

        hm.forEach((s, list) -> {
            System.out.println(s + " = " + String.join("，", list));
        });

    }
}