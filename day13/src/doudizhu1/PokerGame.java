package doudizhu1;

import java.util.*;

public class PokerGame {

    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    //准备牌
    static{
        String[] color = {"♥","♠","♣","♦"};
        String[] name = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //牌盒
        int serialNumber = 1;
        for (var s : name) {
            for (var string : color) {
                hm.put(serialNumber++,s + string);
            }
        }
        hm.put(serialNumber++,"小王");
        hm.put(serialNumber++,"大王");

        for(int i = 1;i < 55;i++){
            list.add(i);
        }

    }

    public PokerGame(){
        Collections.shuffle(list);

        // 发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

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

        lookPoker("底牌",lord);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }

    public void lookPoker(String name,TreeSet<Integer>set){
        System.out.print(name + ": ");
        for (var integer : set) {
            System.out.print(hm.get(integer) + " ");
        }
        System.out.println();

    }

}
