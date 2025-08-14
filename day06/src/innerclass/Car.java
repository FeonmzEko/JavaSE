package innerclass;

public class Car{
    String carBand;
    int carAge;
    String color;

    public void show(){

    }
    class Engine{
        String engineBand;
        int engineAge;

        public void show(){
            System.out.println(engineBand);
            System.out.println(carBand);
        }
    }
}