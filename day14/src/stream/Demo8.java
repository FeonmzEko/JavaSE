package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-16", "周芷若-女-17", "赵敏-女-18", "张强-男-17", "张三丰-男-19");

        List<String> newlist = list.stream()
                .filter(s->(s.split("-")[1]).equals("男"))
                .collect(Collectors.toList());

        Set<String> newSet = list.stream()
                .filter(s->s.split("-")[1].equals("男"))
                .collect(Collectors.toSet());


        Map<String,Integer> map = list.stream()
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        Map<String,Integer> map1 = list.stream()
                .collect(Collectors.toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[2])));

        System.out.println(map);
    }
}
