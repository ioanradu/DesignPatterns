package abstractFactory.car;

public class Duster extends Car {

    public Duster(Integer engineSize) {
        super(engineSize);
        System.out.println("Duster created");
    }
}
