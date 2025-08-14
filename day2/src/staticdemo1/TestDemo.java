package staticdemo1;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类的方法是否正确
        int[] arr1 = {1,2,3,4,5};
        System.out.println(ArrayUtil.printArr(arr1));

        double[] arr2 = {1.4,67,8.0,55.6};
        System.out.println(ArrayUtil.getAverage(arr2));
    }
}
