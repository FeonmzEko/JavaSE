package a04threadmethods;

public class A04_Yield {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("angel");
        MyThread t2 = new MyThread("evil");

        t1.start();
        t2.start();
    }
}
