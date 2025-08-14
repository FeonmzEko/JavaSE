package test2;

public class CatBoSi extends Cat{
    @Override
    public void eat() {
        System.out.println("波斯猫吃小饼干");
    }

    public CatBoSi() {
    }

    public CatBoSi(String name, int age) {
        super(name, age);
    }
}
