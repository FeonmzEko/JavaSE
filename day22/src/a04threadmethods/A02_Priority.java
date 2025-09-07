package a04threadmethods;

public class A02_Priority {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"angel");
        Thread t2 = new Thread(mr,"evil");

        t1.setPriority(10);
        t2.setPriority(9);
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
