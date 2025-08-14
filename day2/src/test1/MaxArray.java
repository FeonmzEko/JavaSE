package test1;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr={1,5,3,56,7};
        System.out.println(max_array(arr));
    }
    public static int max_array(int[] temp){
        int max=0;
        for(int i =0;i<temp.length;i++){
            if(max<temp[i]){
                max=temp[i];
            }
        }
        return max;
    }
}
