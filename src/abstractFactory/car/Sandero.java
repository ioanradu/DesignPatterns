package abstractFactory.car;

public class Sandero extends Car {

    public Sandero(Integer engineSize) {
        super(engineSize);
        System.out.println("Sandero created");
    }
}
