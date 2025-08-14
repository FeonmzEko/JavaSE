package inheritance3;

public class Manager extends Employ{
    private int managerSalary;

    public Manager() {
    }

    public Manager(int ID, String name, int salary, int managerSalary) {
        super(ID, name, salary);
        this.managerSalary = managerSalary;
    }

    @Override
    public void work(){
        System.out.println("管理别人");
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }
}
