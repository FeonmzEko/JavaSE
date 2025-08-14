package inheritance1;

// 就近原则
// 就近原则
// 就近原则

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "Fu";
    public void eat(){
        System.out.println("喝面条");
    }
}

class Zi extends Fu{
    String name = "Zii";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    // 子类重写父类的方法
    @Override
    public void eat(){
        System.out.println("吃米饭");
    }

}