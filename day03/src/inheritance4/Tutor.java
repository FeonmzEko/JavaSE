package inheritance4;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String ID, String name) {
        super(ID, name);
        this.setWork("Tutor");
    }
}
