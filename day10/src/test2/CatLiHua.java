package test2;

public class CatLiHua extends Cat{
    @Override
    public void eat() {
        System.out.println("狸花猫吃鱼");
    }

    public CatLiHua() {
    }

    public CatLiHua(String name, int age) {
        super(name, age);
    }
}
