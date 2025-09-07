package a03callablecase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class A02_MyCallableCase2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable2对象（表示多线程要执行的任务）
        MyCallable2 mc = new MyCallable2();
        //创建FutureTask对象（表示多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t = new Thread(ft);
        //启动线程
        t.start();
        //获取多线程运行的结果
        Integer i = ft.get();

        System.out.println(i);
    }
}
