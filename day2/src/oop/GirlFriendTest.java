package oop;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();

        gf1.setName("弗洛洛");
        gf1.setAge(18);

        System.out.println("家妻"+gf1.getName()+"芳龄"+gf1.getAge());
        System.out.println(gf1);
        gf1.eat();
        gf1.sleep();
    }
}
