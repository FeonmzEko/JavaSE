package date;

import java.util.Scanner;

public class datecompare {
    public static void main(String[] args) {
        // 输入一个数从键盘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你自己的时髦度：");
        int a = sc.nextInt();
        System.out.println("请输入对象自己的时髦度：");
        int b = sc.nextInt();

        Boolean result = a>=b;
        System.out.println(result);
        if(a>b)
        {
            System.out.println("你比对象更时髦");
        }
        else if(a<b)
        {
            System.out.println("你比对象更不时髦");
        }
        else
        {
            System.out.println("你和对象一样时髦");
        }
    }
}
