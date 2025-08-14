package jiekou;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(getAge() + "岁的青蛙" + getName() +"正在吃虫子");
    }
    @Override
    public void swim(){
        System.out.println(getAge() + "岁的青蛙" + getName() +"正在蛙泳");
    }
}
