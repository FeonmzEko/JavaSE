package exception;

public class A01_ExceptionDemo1 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("zhang",10);
        arr[0].setAge(10);
        String name = arr[0].getName();
        System.out.println(name);
    }
}
