package a02list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("111");
        list.add("jpg");
        list.add("pop");

        // 迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //增强for遍历
        for(String s : list){
            System.out.println(s);
        }

        //Lambda遍历
        list.forEach(s -> System.out.println(s));

        //普通for遍历
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // 列表迭代器
        ListIterator<String> it_ = list.listIterator();
        while(it_.hasNext()){
            String str = it_.next();
            if("jpg".equals(str)){
                it_.add("qqq");
            }
        }

        System.out.println(list);
    }
}
