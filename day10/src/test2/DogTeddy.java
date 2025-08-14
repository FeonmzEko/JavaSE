package test2;

public class DogTeddy extends Dog{
    @Override
    public void eat() {
        System.out.println("泰迪吃骨头");
    }

    public DogTeddy() {
    }

    public DogTeddy(String name, int age) {
        super(name, age);
    }
}
