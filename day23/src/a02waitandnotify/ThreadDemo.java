package a02waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.start();
        f.start();
    }
}
