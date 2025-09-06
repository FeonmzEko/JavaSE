package a03callablecase;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class A01_CallableCase {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1  = new Thread(ft);

        t1.start();

        Integer res = ft.get();

        System.out.println(res);

    }
}
