package inheritance4;

public class Employee {
    private String ID;
    private String name;
    private String work;

    public Employee() {
    }

    public Employee(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.work = work = "Employee";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
