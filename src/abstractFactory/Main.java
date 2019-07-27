package abstractFactory;

import abstractFactory.car.Car;

public class Main {

    public static void main(String[] args) {

        CarDealer sandra = new CarDealer();
        Car car1 = sandra.deliverCar(20000d, 2000);
        Car car2 = sandra.deliverCar(14000d, 1200);

    }
}
