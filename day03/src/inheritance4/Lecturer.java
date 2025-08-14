package inheritance4;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String ID, String name) {
        super(ID, name);
        this.setWork("Lecturer");
    }
}
