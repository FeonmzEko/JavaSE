package a05redbag;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int sum = 100;
    static int num = 3;
    static Lock lock = new ReentrantLock();
    static int[] arr = fenPei(sum);

    @Override
    public void run() {
        lock.lock();
        try {
            if(num == 0){
                System.out.println(Thread.currentThread().getName() + "没抢到");
            }else{
                Thread.sleep(1000);
                num--;
                System.out.println(Thread.currentThread().getName() + "抢到了" + arr[num] + "元");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static int[] fenPei(int sum){
        Random r = new Random();
        int total = sum;

        // 生成两个切割点，范围 [0, total]
        int cut1 = r.nextInt(total + 1);
        int cut2 = r.nextInt(total + 1);

        // 排序，保证 cut1 <= cut2
        if (cut1 > cut2) {
            int tmp = cut1;
            cut1 = cut2;
            cut2 = tmp;
        }

        // 三段
        int num1 = cut1;
        int num2 = cut2 - cut1;
        int num3 = total - cut2;

        return new int[]{num1,num2,num3};
    }
}
