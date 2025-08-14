package test2;

public abstract class Dog extends Animal{
    public abstract void eat();

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
