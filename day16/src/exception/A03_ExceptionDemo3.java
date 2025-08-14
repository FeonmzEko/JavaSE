package exception;

public class A03_ExceptionDemo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            System.out.println(arr[10]);
        }catch(ArithmeticException e){
            System.out.println("索引越界");
        }

        System.out.println(111);
    }
}
