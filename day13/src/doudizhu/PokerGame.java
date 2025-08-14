package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();

    //准备牌
    static{
        String[] color = {"♥","♠","♣","♦"};
        String[] name = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //牌盒
        for (var s : color) {
            for (var string : name) {
                list.add(s+string);
            }
        }
        list.add("小王");
        list.add("大王");

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for(int i = 0;i < list.size();i++){
            if(i < 3){
                lord.add(list.get(i));
                continue;
            }

            if(i % 3 == 0){
                player1.add(list.get(i));
            }else if(i % 3 == 1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }
    public void lookPoker(String s,ArrayList<String> list){
        System.out.print(s + ": ");
        Iterator<String> it =list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            if(it.hasNext()){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
