package a06choujiang;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.start();
        t2.start();
    }
}
