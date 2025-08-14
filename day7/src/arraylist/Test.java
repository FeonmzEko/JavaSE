package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> newList = targetPhone(list,3000);
        System.out.print("[");
        for(int i = 0;i<newList.size();i++){
            if(i<newList.size()-1){
                System.out.print("(" + newList.get(i).getBand() + "," + newList.get(i).getPrice() + ") ,");
            }else{
                System.out.print("(" + newList.get(i).getBand() + "," + newList.get(i).getPrice() + ")");
            }
        }
        System.out.println("]");
    }

    @org.jetbrains.annotations.NotNull
    public static ArrayList<Phone> targetPhone(ArrayList<Phone> P, int price){
        ArrayList<Phone> ans = new ArrayList<>();
        for(int i = 0;i < P.size();i++){
            if(P.get(i).getPrice() < 3000){
                Phone p = new Phone(P.get(i).getBand(),P.get(i).getPrice());
                ans.add(p);
            }
        }
        return ans;
    }
}
