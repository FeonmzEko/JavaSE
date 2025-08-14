package generics;

public class MyArrayListDemo1 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();
        System.out.println(list.toString());
        list.add(111);
    }
}
