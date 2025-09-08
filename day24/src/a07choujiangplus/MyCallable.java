package a07choujiangplus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    ArrayList<Integer>list;
    public MyCallable(ArrayList<Integer> list){
        this.list = list;
    }
    @Override
    public Integer call() throws Exception {
        ArrayList<Integer>boxList = new ArrayList<>();
        while(true){
            synchronized (MyCallable.class){
                if(list.size() == 0){
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }
        if(boxList.size() == 0){
            return null;
        }else{
            return Collections.max(boxList);
        }
    }
}
