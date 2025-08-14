package demo2;

public class Outer {
    String name;

    public class Inner{
        static int a = 10;
    }

    public Inner getInstance(){
        return new Inner();
    }
}
