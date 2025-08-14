package Abstract;

public class Test {
    public static void main(String[] args) {
        // 创建对象：多态方式
        // Fu f = new Zi();
        Animal a = new Dog();
        // 变量调用：编译看左边，运行也看左边
        // 编译看左边：javac编译代码时，会看左边父类有没有这个变量，有则编译成功，否则失败
        // 运行也看左边：java运行代码时，获取左边父类变量的值
        System.out.println(a.name);

        // 方法调用：编译看左边，运行看右边
        // 运行看右边：java运行代码时，获取右边子类变量的方法
        a.show();
    }
}

class Animal{
    String name = "Animal";

    public void show(){
        System.out.println("Animal --- show方法");
    }
}

class Dog extends Animal{
    String name = "Dog";

    @Override
    public void show(){
        System.out.println("Dog --- show方法");
    }
}

class Cat extends Animal{
    String name = "Cat";

    @Override
    public void show(){
        System.out.println("Cat --- show方法");
    }
}
