package oop;

// Javabean类
public class Phone {
    String brand;
    double price;
    public void call(){
        System.out.println("call");
    }
    public void playGame(){
        System.out.println("gaming");
    }
    public void setBrand(String _brand){
        brand = _brand;
    }
}
