package test;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                int sum1 = o1.getMathGrade() + o1.getChineseGrade()+ o1.getEnglishGrade();
                int sum2 = o2.getMathGrade() + o2.getChineseGrade()+ o2.getEnglishGrade();
                int ans = 0;
                if(sum1-sum2!=0){
                    ans = sum1 - sum2;
                }else if(o1.getChineseGrade() - o2.getChineseGrade()!=0){
                    ans = o1.getChineseGrade() - o2.getChineseGrade();
                }else if(o1.getMathGrade() - o2.getMathGrade()!=0){
                    ans = o1.getMathGrade() - o2.getMathGrade();
                }else if(o1.getEnglishGrade() - o2.getEnglishGrade()!=0){
                    ans = o1.getEnglishGrade() - o2.getEnglishGrade();
                }else if(o1.getAge() - o2.getAge()!=0){
                    ans = o1.getAge() - o2.getAge();
                }else if(o1.nameCompare(o2)!=0){
                    ans = o1.nameCompare(o2);
                }
                return -ans;
            }
        });

        Student s1 = new Student("zhang",20,100,100,100);
        ts.add(s1);
        ts.add(new Student("san",20,9,100,100));

        for (var t : ts) {
            System.out.print(t.getName() + ",");
            System.out.print(t.getAge() + ",");
            System.out.print(t.getMathGrade() + ",");
            System.out.print(t.getChineseGrade() + ",");
            System.out.println(t.getEnglishGrade());
        }

        System.out.println(ts);

    }
}
