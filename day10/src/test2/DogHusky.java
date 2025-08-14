package test2;

public class DogHusky extends Dog{
    @Override
    public void eat() {
        System.out.println("哈士奇吃骨头");
    }

    public DogHusky() {
    }

    public DogHusky(String name, int age) {
        super(name, age);
    }
}
