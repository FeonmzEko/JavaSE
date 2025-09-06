package a02runnablecase;

public class A01_RunnableDemo1 {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);

        t1.setName("1");
        t2.setName("2");

        t1.start();
        t2.start();
    }
}