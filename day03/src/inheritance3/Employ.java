package inheritance3;

public class Employ {
    private int ID;
    private String name;
    private int salary;

    public Employ() {
    }

    public Employ(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public void work(){}
    public void eat(){
        System.out.println("吃米饭");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
