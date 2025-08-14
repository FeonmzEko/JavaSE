package dynamic;

public class DynamicDemo1 {
    public static void main(String[] args) {

        System.out.println(getSum(1,2,3,4,5,6,7,8,9,10));
    }
    public static int getSum(int...args){
        int sum = 0;
        for(int temp:args){
            sum += temp;
        }
        return sum;
    }
}
