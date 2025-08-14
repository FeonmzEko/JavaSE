package test1;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal dc, String something){
        if(dc instanceof Dog d){
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的狗");
            d.eat(something);
        }else if(dc instanceof Cat c){
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getColor() + "的" + c.getAge() + "岁的猫");
            c.eat(something);
        }
    }
}
