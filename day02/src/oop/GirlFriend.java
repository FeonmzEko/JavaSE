package oop;

public class GirlFriend {
    // 属性
    private String name;
    private int age;
    private String gender;

    // 行为
    public GirlFriend(){
        this("NaoPo",18,"girl");
    }

    public GirlFriend(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("My girl friend is sleeping.");
    }

    public void eat(){
        System.out.println("My girl friend is eating.");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("Statics Error!");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }
}
