package a04threadmethods;

public class A03_ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Cheny");
        t2.setName("FeonzmEko");

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }

}
