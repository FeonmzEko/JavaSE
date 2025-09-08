package a01zusequeue;

import java.util.concurrent.ArrayBlockingQueue;

public class A01_ThreadDemo {
    public static void main(String[] args) {
        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String>queue = new ArrayBlockingQueue<>(1);
        //2.创建线程对象，并把阻塞队列传递进去
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();
    }
}
