package a04threadmethods;

public class A05_Join {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setName("angel");
        t.start();

        // 表示把t这个线程，插入到当前线程之前，
        // t:土豆
        // 当前线程：运行在main，为main线程
        t.join();

        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
