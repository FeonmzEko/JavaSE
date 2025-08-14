package inheritance4;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String ID,String name){
        super(ID,name);
        this.setWork("Teacher");
    }
}
