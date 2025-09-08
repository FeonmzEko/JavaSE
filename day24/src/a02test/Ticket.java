package a02test;

public class Ticket {
    public static void main(String[] args) {
        Thread t1 = new Cinema();
        Thread t2 = new Cinema();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
