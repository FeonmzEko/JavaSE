package a01threadcase;

public class A02_ThreadCaseDemo2 {
    public static void main(String[] args) {
        MyThread2 t1 =new MyThread2();
        MyThread2 t2 =new MyThread2();

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
