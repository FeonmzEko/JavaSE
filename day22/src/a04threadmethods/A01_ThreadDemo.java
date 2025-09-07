package a04threadmethods;

public class A01_ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("angel");
        MyThread t2 = new MyThread("evil");

        t1.start();
        t2.start();

        Thread t = Thread.currentThread();
        System.out.println(t.getName());

    }
}
