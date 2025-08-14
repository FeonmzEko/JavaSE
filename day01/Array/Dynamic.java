package Array;

import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        System.out.println("你需要保存多少数据？");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number;i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0;i < number;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.println(array.length);
    }
}
