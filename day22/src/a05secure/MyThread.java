package a05secure;

public class MyThread extends Thread{

    static int ticket = 0;
    static Object obj = new Object();
    @Override
    public void run(){
        while(true){
            synchronized (MyThread.class){
                if(ticket < 500){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(this.getName() + "正在卖第" + ticket + "张票！！！" );
                }else {
                    break;
                }
            }
        }
    }
}
