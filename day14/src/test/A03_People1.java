package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A03_People1 {
    public static void main(String[] args) {
        ArrayList<String> actor = new ArrayList<>();
        ArrayList<String> actress = new ArrayList<>();

        Collections.addAll(actor,"张伟大-32", "李强小-28", "王涛明-35", "刘小洋-30", "赵磊-27", "陈刚-33");
        Collections.addAll(actress,"杨娜-25", "杨芳-29", "张静-31", "刘琳-26", "赵丽-28", "陈敏-27");


        /*Stream.concat(actor.stream().filter(s->s.split("-")[0].length()==3).limit(2),actress.stream().filter(s->"杨".equals(s.split("-")[1]))
                .skip(1)).map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s){
                        return new Actor(s.split("-")[0],Integer.parseInt(s.split("-")[1]));
                    }
        });*/

        List<Actor> list = Stream.concat(actor.stream().filter(s -> s.split("-")[0].length() == 3).limit(2), actress.stream().filter(s -> "杨".charAt(0) == (s.split("-")[0].charAt(0))).skip(1))
                .map(s -> new Actor(s.split("-")[0], Integer.parseInt(s.split("-")[1]))).collect(Collectors.toList());

        System.out.println(list);


    }

}
