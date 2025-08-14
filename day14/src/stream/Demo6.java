package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-16", "周芷若-17", "赵敏-18", "张强-17", "张三丰-19");

        list.stream().map(new Function<String,Integer>(){
            @Override
            public Integer apply(String s){
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));

        list.stream()
                .map(s->(Integer.parseInt(s.split("-")[1])))
                .forEach(s-> System.out.println(s));

    }
}
