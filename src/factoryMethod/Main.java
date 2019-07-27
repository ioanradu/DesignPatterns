package factoryMethod;

public class Main {

    public static void main(String[] args) {

        DaciaFactory factory = new DaciaFactory();
        Car car1 = factory.createCar(1200);
        Car car2 = factory.createCar(2000);

    }
}
