package test1;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Boolean is_equal = true;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                is_equal = false;
            }
        }
        if(is_equal){
            System.out.println("是回文");
        }
        else{
            System.out.println("不是回文");
        }
    }
}
