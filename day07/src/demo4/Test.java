package demo4;

public class Test {
    public static void main(String[] args) {

        // Swim接口的实现类的对象
        Swim swimmer = new Swim(){
            @Override
            public void swim() {
                System.out.println("Override.swim");
            }
        };

        swimmer.swim();
    }
}