package inheritance1;

public class DogTest {
    public static void main(String[] args) {

    }
}

class Dog{
    public void drink(){}
    public void lookHouse(){}
    public void eat(){
        System.out.println("吃饭");
    }
}

class Husky extends Dog{
    public void breakHouse(){}
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
}

class ShaPi extends Dog{
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
}

class ZhongHua extends Dog{
    @Override
    public void eat(){
        System.out.println("吃剩饭，吃骨头");
    }
}