package test2;

public abstract class Cat extends Animal{
    public abstract void eat();

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
