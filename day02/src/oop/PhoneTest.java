package oop;

// 测试类
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "xiaomi";
        p.price = 1999.0;

        p.setBrand("huawei");

        System.out.println(p.brand);
        System.out.println(p.price);

        p.playGame();
        p.call();
    }
}
