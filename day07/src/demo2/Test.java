package demo2;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();

        //Outer o;
        //System.out.println(o.getInstance());
    }
}
