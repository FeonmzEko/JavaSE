package test1;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(100) + 1;
        }

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
