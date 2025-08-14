package inheritance4;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String ID, String name) {
        super(ID, name);
        this.setWork("Buyer");
    }
}
