package test;

public class Student {
    private String name;
    private int age;
    private int mathGrade;
    private int ChineseGrade;
    private int EnglishGrade;

    public Student() {
    }

    public Student(String name, int age, int mathGrade, int chineseGrade, int englishGrade) {
        this.name = name;
        this.age = age;
        this.mathGrade = mathGrade;
        ChineseGrade = chineseGrade;
        EnglishGrade = englishGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getChineseGrade() {
        return ChineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        ChineseGrade = chineseGrade;
    }

    public int getEnglishGrade() {
        return EnglishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        EnglishGrade = englishGrade;
    }

    public int nameCompare(Student o){
        int i = this.getName().length() - o.getName().length();
        // 如果一样长则按照首字母排序
        i = (i == 0 ? this.getName().compareTo(o.getName()) : i);
        return i;
    }


}
