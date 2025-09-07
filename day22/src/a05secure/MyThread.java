package a05secure;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static Lock lock = new ReentrantLock();
    static int ticket = 0;
    @Override
    public void run(){
        while(true){
            lock.lock();
            try {
                if(ticket < 500){
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(this.getName() + "正在卖第" + ticket + "张票！！！" );
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
