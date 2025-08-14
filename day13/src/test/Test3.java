package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Angel","Sakura","Saki","MoTong","YueKui");

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Angel",0);
        hm.put("Sakura",0);
        hm.put("Saki",0);
        hm.put("YueKui",0);
        hm.put("MoTong",0);

        Random random = new Random();
        int index;
        while(hm.size()>0){
            do{
                index = random.nextInt(list.size());
            }while(!hm.containsKey(list.get(index)));
            System.out.println(list.get(index));
            hm.remove(list.get(index));
        }

    }
}
