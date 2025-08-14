package inheritance2;

// 可通过super()来调用父类的构造方法
public class Son extends Father{
    public Son(){
        super(); // 调用父类无参构造
    }
    public Son(String name,int age){
        super(name,age); // 调用父类有参构造
    }
}
