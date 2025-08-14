package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*班级里有N个学生，现在随机点名，0.7概率抽到男生，0.3概率抽到女生*/
        ArrayList<String> girls = new ArrayList<>();
        ArrayList<String> boys = new ArrayList<>();

        girls.add("Angel");
        girls.add("ShaWu");
        girls.add("Sakura");

        boys.add("LiSi");
        boys.add("ZhangSan");
        boys.add("WangEr");
        boys.add("MaZi");

        Random random = new Random();

        double r = random.nextDouble();
        if(r<0.7){
            Collections.shuffle(boys);
            System.out.println(boys.get(0));
        }else{
            Collections.shuffle(girls);
            System.out.println(girls.get(0));
        }
    }
}
