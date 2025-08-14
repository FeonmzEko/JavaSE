package inheritance4;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String ID,String name){
        super(ID,name);
        this.setWork("AdminStaff");
    }
}
