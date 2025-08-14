package jiekou;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(getAge() + "岁的狗子" + getName() +"正在吃胡萝卜");
    }

    @Override
    public void swim(){
        System.out.println(getAge() + "岁的狗子" + getName() +"正在狗刨");
    }
}
