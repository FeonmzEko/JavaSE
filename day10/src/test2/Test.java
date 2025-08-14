package test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        list.add(new DogHusky("1",2));
        list.add(new DogTeddy("1",2));
        keepPet(list);

    }
    public static void keepPet(ArrayList<? extends Animal> list){
        for(Animal ani:list){
            if(ani instanceof Cat c){
                c.eat();
            }else if(ani instanceof Dog d){
                d.eat();
            }
        }
    }
}