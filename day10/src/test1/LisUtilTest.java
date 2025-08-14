package test1;

import java.util.ArrayList;

public class LisUtilTest {
    public static void main(String[] args) {
        String s1 = "1111";
        String s2 = "222";
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list,s1,s2);

        System.out.println(list);
    }
}
