package myfuction;

import java.util.Arrays;

public class A01_FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {3,5,4,1,6,2};

        Arrays.sort(arr, (o1,o2)->o1-o2);

        Arrays.sort(arr,(o1,o2)-> o1 - o2);

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已存在
        //3.被引用的方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用的方法需要满足当前的需求
        Arrays.sort(arr,A01_FunctionDemo1::sub);


        System.out.println(Arrays.toString(arr));


    }
    //可以是java已经写好的，也可以是第三方的工具类
    public static int sub(int num1, int num2){
        return num2 - num1;
    }
}
