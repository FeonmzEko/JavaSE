package staticdemo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个集合来储存学生对象
        ArrayList<Student>list = new ArrayList<>();

        Student stu1 = new Student("zhangsan",23,"male");
        Student stu2 = new Student("lisi",21,"male");
        Student stu3 = new Student("wangwu",18,"female");

        // 3.把学生对象添加到集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxStudent(list);

        System.out.println(maxAge);
    }
}
