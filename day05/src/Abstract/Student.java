package Abstract;

public class Student extends Person{

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
