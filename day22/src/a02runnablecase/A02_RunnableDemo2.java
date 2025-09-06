package a02runnablecase;

import a01threadcase.MyThread;

public class A02_RunnableDemo2 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
