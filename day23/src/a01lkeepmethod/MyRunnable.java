package a01lkeepmethod;

public class MyRunnable implements Runnable{
    int ticket = 0;
    @Override
    public void run() {
        //循环
        while(true){
            //同步代码块
            synchronized (MyRunnable.class){
                if (extracted()) break;
            }
        }
    }

    private boolean extracted() {
        //判断共享数据是否到了末尾，如果到了末尾
        if(ticket == 100){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票！");
        }
        return false;
    }
}
