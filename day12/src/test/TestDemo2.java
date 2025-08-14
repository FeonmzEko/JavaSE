package test;

import java.util.Scanner;
import java.util.TreeMap;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        TreeMap<Character,Integer> tm = new TreeMap<>();

        for(int i = 0 ;i < s.length();i++){
            char temp = s.charAt(i);
            if(tm.containsKey(temp)){
                int count = tm.get(temp);
                count++;
                tm.put(temp,count);
            }else{
                tm.put(temp,1);
            }
        }

        System.out.println(tm);
    }
}
