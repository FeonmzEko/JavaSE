package a07choujiangplus;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public static int number;
    static Lock lock = new ReentrantLock();
    ArrayList<Integer>ts1 = new ArrayList<>();
    ArrayList<Integer>ts2 = new ArrayList<>();
    public static ArrayList<Integer>list;
    public static int MAX;

    MyThread(ArrayList<Integer> list){
        MyThread.list = list;
        MyThread.number = list.size();
        Collections.sort(list);
        MAX = list.getLast();
        Collections.shuffle(MyThread.list);
    }

    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if(number == 0){
                    if(Thread.currentThread().getName().split("-")[1].equals("1")){
                        Print(ts1);
                    }else{
                        Print(ts2);
                    }
                    break;
                }else{
                    Thread.sleep(100);
                    number--;
                    if(Thread.currentThread().getName().split("-")[1].equals("1")){
                        ts1.add(list.get(number));
                    }else{
                        ts2.add(list.get(number));
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }


    public void Print(ArrayList<Integer>ts){
        String name = Thread.currentThread().getName().split("-")[1];
        System.out.println("在此次抽奖过程中，抽奖箱" + name + "总共产生了" + ts.size() + "个奖项");
        System.out.print("分别为： ");
        int sum = 0;
        int max = 0;
        for(int i = 0;i<ts.size();i++){
            if(max<ts.get(i)){
                max = ts.get(i);
            }
            sum += ts.get(i);
            System.out.print(ts.get(i));
            if(i!=ts.size()-1){
                System.out.print(",");
            }
        }
        System.out.print(" 最高奖项为" + max + "元," + "总金额为" + sum + "元.");
        System.out.println();
    }
}
