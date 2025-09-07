package a02waitandnotify;

public class Desk {
    /*
    *
    * 作用：控制生产者和消费者的执行
    *
    * */

    // 采用int类型来控制多条线程执行
    public static int foodFlag = 0;
    // 总个数
    public static int count = 10;
    // 锁对象
    public static Object lock = new Object();
}
