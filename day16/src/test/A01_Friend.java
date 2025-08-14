package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A01_Friend {
    public static void main(String[] args) {

        GrilFriend gf = new GrilFriend();
        Scanner sc = new Scanner(System.in);

        while(true){
            try {
                System.out.println("请输入你心爱的女朋友的名字：");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入你心爱的女朋友的年年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeFormatException e) {
                e.printStackTrace();
            }
        }

        System.out.println(gf);

    }
}
