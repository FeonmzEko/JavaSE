package a08executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //1.获取线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //2.提交任务

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        //3.销毁线程池
        pool.shutdown();

    }
}
