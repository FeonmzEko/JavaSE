package jiekou;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name,int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println(getAge() + "岁的兔子" + getName() +"正在吃胡萝卜");
    }
}
