package a06choujiang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public static int number;
    public static Lock lock = new ReentrantLock();
    public static ArrayList<Integer>list;

    MyThread(ArrayList<Integer> list){
        MyThread.list = list;
        MyThread.number = list.size();
        Collections.shuffle(MyThread.list);
    }

    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if(number == 0){
                    break;
                }else{
                    Thread.sleep(100);
                    number--;
                    System.out.println(Thread.currentThread().getName() + "产生了大奖" + list.get(number) + "元");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }

}
