package test1;

public class Test {
    public static void main(String[] args) {
        Administrator a = new Administrator("0x00",18);
        Teacher t = new Teacher("11",11);
        Student s = new Student("22",22);

        register(a);
        register(t);
        register(s);
    }

    public static void register(Person p){
        p.show();
    }
}
