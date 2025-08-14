package inheritance3;

public class Cook extends Employ{

    public Cook() {
    }

    public Cook(int ID, String name, int salary) {
        super(ID,name,salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
