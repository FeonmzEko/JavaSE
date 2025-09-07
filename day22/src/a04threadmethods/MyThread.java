package a04threadmethods;

public class MyThread extends Thread{

    MyThread(){
        super();
    }

    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i < 101; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}
