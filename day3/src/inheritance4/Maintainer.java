package inheritance4;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String ID, String name) {
        super(ID, name);
        this.setWork("Maintainer");
    }
}
